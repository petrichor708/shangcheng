package com.lala.xiguamall.order.dao;

import com.lala.xiguamall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2022-01-04 16:10:11
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
