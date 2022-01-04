package com.lala.xiguamall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lala.common.utils.PageUtils;
import com.lala.xiguamall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wujimin
 * @email wmm@gmail.com
 * @date 2022-01-04 15:42:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

