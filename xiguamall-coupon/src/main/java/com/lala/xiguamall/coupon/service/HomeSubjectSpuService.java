package com.lala.xiguamall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lala.common.utils.PageUtils;
import com.lala.xiguamall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2022-01-05 11:41:24
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

