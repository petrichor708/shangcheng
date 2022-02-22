package com.lala.xiguamall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lala.common.utils.PageUtils;
import com.lala.common.utils.Query;

import com.lala.xiguamall.product.dao.CategoryDao;
import com.lala.xiguamall.product.entity.CategoryEntity;
import com.lala.xiguamall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有分类
        List<CategoryEntity> list = baseMapper.selectList(null);

        //查出一级分类,用流过滤
        List<CategoryEntity> level1Menus = list.stream().filter(entity -> entity.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(getChildrens(menu, list));
                    return menu;
                }).sorted((menu1, menu2) -> {
                    return menu1.getSort() - menu2.getSort();
                }).collect(Collectors.toList());
        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 1、检查当前删除的菜单是否被别的地方引用
        baseMapper.deleteBatchIds(asList);
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity categoryEntity, List<CategoryEntity> list) {
        List<CategoryEntity> childrens = list.stream().filter(entity -> categoryEntity.getCatId() == entity.getParentCid())
                .map(menu -> {
                    menu.setChildren(getChildrens(menu, list));
                    return menu;
                }).sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                }).collect(Collectors.toList());
        return childrens;
    }
}