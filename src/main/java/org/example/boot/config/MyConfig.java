package org.example.boot.config;

import org.example.boot.bean.Pet;
import org.example.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: springboot-first
 * @BelongsPackage: org.example.boot.config
 * @ClassName MyConfig
 * @Author: RookieFu
 * @CreateTime: 2022-08-22  19:29
 * @UpdateTime: 2022-08-22  19:29
 * @Description: TODO
 * @Version:
 */
@Configuration  // 告诉SpringBoot这是一个配置类 == 配置文件
public class MyConfig {

    @Bean
    public User user01(){
        return new User("fpp",18);
    }

    @Bean("tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }

}
