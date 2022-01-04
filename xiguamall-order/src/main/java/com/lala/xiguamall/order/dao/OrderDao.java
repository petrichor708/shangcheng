package com.lala.xiguamall.order.dao;

import com.lala.xiguamall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2022-01-04 16:10:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
