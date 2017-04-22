package com.nr.test;

import com.alibaba.fastjson.JSON;
import com.nr.pojo.User;
import com.nr.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by nr on 2017/04/22 0022.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
    private static Logger logger=Logger.getLogger(TestMybatis.class);
    @Resource
    private IUserService userService=null;

    @Test
    public void test1(){
        User user=userService.getUserById(2);
        System.out.println(user.getUsername());
        logger.info(JSON.toJSONString(user));
    }
}
