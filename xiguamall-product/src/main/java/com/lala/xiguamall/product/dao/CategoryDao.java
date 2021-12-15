package com.lala.xiguamall.product.dao;

import com.lala.xiguamall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2021-12-12 19:49:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
