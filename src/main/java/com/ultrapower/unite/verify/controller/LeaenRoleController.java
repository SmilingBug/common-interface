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
        System.out.println("i am test");
        this.queryLearnRole(new Long(1));
    }

    /**
     * ajsdjahdjdhjsadsad
     */
    public void solve() {
        System.out.println("123");
        this.learnRoleService.hashCode();
    }

    public void test2() {
        String myName = "yqk";
        System.out.println(myName);
    }

    public void test5() {
        String myName = "hhhhhh";
        System.out.println(myName);
    }


    public void testforconflict() {
        int i = 8;
        String[] arr = new String[]{"a","b"};
        for (int j = 0; j < i;j++) {
            System.out.println(j);
        }
    }

    public void test6() {
        for(int i = 0; i < 10; i++) {
        }
    }

    public void test7() {
        for(int i = 0; i < 10; i++) {
        }
    }
}
