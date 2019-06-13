package com.wangzhanxiong.crm.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoImplTest {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Test
    public void testFindAll() {
        System.out.println("TTTTTTT");
        System.out.println(userDao.findAll());
    }
}
