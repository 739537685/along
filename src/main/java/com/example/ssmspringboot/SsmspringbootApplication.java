package com.example.ssmspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.ssmspringboot.mapper")
public class SsmspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmspringbootApplication.class, args);
	}
}
