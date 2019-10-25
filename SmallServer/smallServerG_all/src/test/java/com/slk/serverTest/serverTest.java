package com.slk.serverTest;


import com.slk.MySpringBootApplication;
import com.slk.dao.UserDao;
import com.slk.dao.UserMapper;
import com.slk.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = MySpringBootApplication.class)
@RunWith(SpringRunner.class)
public class serverTest {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserDao userDao;

    @Test
    public void testMapper(){
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testJPA(){
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }

}
