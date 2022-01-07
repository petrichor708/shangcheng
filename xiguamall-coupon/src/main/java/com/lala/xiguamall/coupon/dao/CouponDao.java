package com.lala.xiguamall.coupon.dao;

import com.lala.xiguamall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2022-01-05 11:41:24
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
