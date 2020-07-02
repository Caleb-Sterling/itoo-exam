package com.tfjybj.itoo.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.tfjybj.itoo.exam.provider.service.*","com.tfjybj.itoo.exam.provider.dao"})
public class ExamWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamWebApplication.class, args);
    }

}
