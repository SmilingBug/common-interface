package com.ultrapower.unite.verify.impl;

import com.ultrapower.unite.common.pojo.LearnRole;
import com.ultrapower.unite.common.mapper.LearnRoleMapper;
import com.ultrapower.unite.verify.service.LearnRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: common-interface
 * @description: LearnRoleSe
 * @author: yang Qiankun
 * @create: 2019-06-19 21:12
 **/
@Service
public class LearnRoleServiceImpl implements LearnRoleService {

    @Autowired
    private LearnRoleMapper learnRoleMapper;

    @Override
    public LearnRole queryLearnRole(Long id) {
        return learnRoleMapper.queryLearnRole(id);
    }
}
