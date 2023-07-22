package com.example;

import com.example.dao.AdminDao;
import com.example.domain.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private AdminDao adminDao;

    @Test
    public void test(){
        Admin admin = adminDao.find();
        System.out.println(admin.toString());
    }

}
