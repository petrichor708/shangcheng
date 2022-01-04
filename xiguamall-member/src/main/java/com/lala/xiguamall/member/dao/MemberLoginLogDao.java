package com.lala.xiguamall.member.dao;

import com.lala.xiguamall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2022-01-04 15:42:04
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
