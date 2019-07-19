package com.ultrapower.unite.verify.controller;

import com.ultrapower.unite.common.pojo.LearnRole;
import com.ultrapower.unite.verify.service.LearnRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: common-interface
 * @description:角色控制器
 * @author: yang Qiankun
 * @create: 2019-06-19 21:14
 **/
@RestController
public class LeaenRoleController {

    @Autowired
    private LearnRoleService learnRoleService;

    @RequestMapping("/queryLearnRole")
    public LearnRole queryLearnRole(Long id){
        return learnRoleService.queryLearnRole(id);
    }


    public void test() {
        
    }

    public void test2() {
        String myName = "yqk";
        System.out.println(myName);
    }
}
