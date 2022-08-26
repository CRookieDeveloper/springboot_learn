package org.example.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: springboot-first
 * @BelongsPackage: org.example.boot.controller
 * @ClassName HelloController
 * @Author: RookieFu
 * @CreateTime: 2022-08-21  20:09
 * @UpdateTime: 2022-08-21  20:09
 * @Description: TODO
 * @Version:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Boot 2";
    }
}
