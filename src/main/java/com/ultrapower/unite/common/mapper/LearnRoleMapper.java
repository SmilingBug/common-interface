package com.ultrapower.unite.common.mapper;

import com.ultrapower.unite.common.pojo.LearnRole;
import com.ultrapower.unite.common.pojo.RoleParams;

import java.util.List;

/**
 * @program: common-interface
 * @description: LearnRoleMapper
 * @author: yang Qiankun
 * @create: 2019-06-18 23:33
 **/
public interface LearnRoleMapper {
    LearnRole queryLearnRole(Long id);

    List<LearnRole> queryLearnRoleLike(RoleParams roleParams);

    int insertRole(LearnRole learnRole);

    int updateRole(Long id);
}
