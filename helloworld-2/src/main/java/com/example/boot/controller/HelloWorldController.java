package com.example.boot.controller;

import com.example.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: springboot-first
 * @BelongsPackage: com.example.boot.controller
 * @ClassName HelloWorldController
 * @Author: RookieFu
 * @CreateTime: 2022-08-25  19:53
 * @UpdateTime: 2022-08-25  19:53
 * @Description: TODO
 * @Version:
 */
@RestController
public class HelloWorldController {
    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){
        String userName = person.getUserName();
        System.out.println(userName);
        return person;
    }
}
