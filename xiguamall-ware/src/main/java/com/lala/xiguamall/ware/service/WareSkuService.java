package com.lala.xiguamall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lala.common.utils.PageUtils;
import com.lala.xiguamall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2022-01-04 16:14:10
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

