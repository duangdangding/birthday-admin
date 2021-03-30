package com.lsh.birthdayadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lsh.birthdayadmin.mapper")
public class BirthdayAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BirthdayAdminApplication.class, args);
    }

}
