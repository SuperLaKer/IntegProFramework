package com.slk.mybatisjpaboot;

import com.slk.mybatisjpaboot.dao.UserDao;
import com.slk.mybatisjpaboot.domain.User;
import com.slk.mybatisjpaboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class MybatisjpabootApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    // JPA 测试
    @Test
    void findAll(){
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }

    // mybatis 测试
    @Test
    void findAllMybatis(){
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }


}
