package com.example.shardingjdbcmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) //排除DataSourceConfiguratrion
@ComponentScan(basePackages = {"com.example.shardingjdbcmybatis.*"})
//@EnableTransactionManagement(proxyTargetClass = true)   //开启事物管理功能
public class ShardingJdbcMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcMybatisApplication.class, args);
    }

}
