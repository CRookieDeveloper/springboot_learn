package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @BelongsProject: springboot-first
 * @BelongsPackage: org.example.boot
 * @ClassName MainApplication
 * @Author: RookieFu
 * @CreateTime: 2022-08-21  20:02
 * @UpdateTime: 2022-08-21  20:02
 * @Description: TODO
 * @Version:
 */
//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.example.boot")
public class MainApplication {
    public static void main(String[] args){
        SpringApplication.run(MainApplication.class, args);
    }
}
