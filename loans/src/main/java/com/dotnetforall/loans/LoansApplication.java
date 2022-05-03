package com.dotnetforall.loans;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@ComponentScans({ @ComponentScan("com.dotnetforall.loans.controller") })
@EnableJpaRepositories("com.dotnetforall.loans.repository")
@EntityScan("com.dotnetforall.loans.model")
public class LoansApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
    }

}
