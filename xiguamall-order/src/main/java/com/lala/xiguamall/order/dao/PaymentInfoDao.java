package com.lala.xiguamall.order.dao;

import com.lala.xiguamall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2022-01-04 16:10:11
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
