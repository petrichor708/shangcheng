package com.lala.xiguamall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lala.common.utils.PageUtils;
import com.lala.xiguamall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2021-12-12 19:49:07
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

