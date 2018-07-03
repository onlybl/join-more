package com.sicaudragon.joinmore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sicaudragon.joinmore.dao")
public class JoinMoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoinMoreApplication.class, args);
	}
}
