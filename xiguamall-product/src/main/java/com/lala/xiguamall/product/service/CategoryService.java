package com.lala.xiguamall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lala.common.utils.PageUtils;
import com.lala.xiguamall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2021-12-12 19:49:07
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

