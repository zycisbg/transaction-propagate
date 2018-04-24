package com.zyc.transactionpropagate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.zyc.transactionpropagate.dao")
public class TransactionPropagateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionPropagateApplication.class, args);
	}
}
