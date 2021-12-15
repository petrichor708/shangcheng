package com.lala.xiguamall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lala.common.utils.PageUtils;
import com.lala.xiguamall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2021-12-12 19:49:07
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

