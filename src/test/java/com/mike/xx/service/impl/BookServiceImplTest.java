package com.mike.xx.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mike.xx.BaseTest;
import com.mike.xx.dto.AppointExecution;
import com.mike.xx.service.BookService;

public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookServiceImpl bookService;

    @Test
    public void testAppoint() throws Exception {
        long bookId = 1001;
        long studentId = 12345678910L;
        AppointException execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }

}