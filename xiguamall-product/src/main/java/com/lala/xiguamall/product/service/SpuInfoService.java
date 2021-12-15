package com.lala.xiguamall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lala.common.utils.PageUtils;
import com.lala.xiguamall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2021-12-12 19:49:07
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

