package com.lala.xiguamall.order.dao;

import com.lala.xiguamall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2022-01-04 16:10:11
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
