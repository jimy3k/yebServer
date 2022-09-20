package com.nicole.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nicole.server.mapper")  //用于扫描Mapper接口所在的包
public class YebApplication {

    public static void main(String[] args) {

        SpringApplication.run(YebApplication.class, args);

    }

}
