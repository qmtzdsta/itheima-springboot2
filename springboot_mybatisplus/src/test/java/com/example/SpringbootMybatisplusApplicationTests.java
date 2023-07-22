package com.example;

import com.example.dao.AdminDao;
import com.example.domain.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisplusApplicationTests {

    @Autowired
    AdminDao adminDao;
    @Test
    void Test(){
        List<Admin> admins = adminDao.selectList(null);
        System.out.println(admins.size());
        for (Admin admin : admins) {
            System.out.println(admin.toString());
        }
    }

    @Test
    void test1(){
        
    }

}
