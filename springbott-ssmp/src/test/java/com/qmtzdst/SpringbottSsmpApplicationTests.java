package com.qmtzdst;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qmtzdst.dao.BookDao;
import com.qmtzdst.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class SpringbottSsmpApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void test() {
        Book book = bookDao.selectById(1);
        System.out.println(book.toString());
//        log.info("{}",book);
    }

    @Test
    void testPage(){
        IPage ipage = new Page(1,5);
        IPage page = bookDao.selectPage(ipage, null);

    }

}
