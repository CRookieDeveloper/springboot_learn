package com.example.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @BelongsProject: springboot-first
 * @BelongsPackage: com.example.boot.bean
 * @ClassName Person
 * @Author: RookieFu
 * @CreateTime: 2022-08-25  19:39
 * @UpdateTime: 2022-08-25  19:39
 * @Description: TODO
 * @Version:
 */
@ConfigurationProperties(prefix = "person")
@Component
@ToString
@Data
public class Person {
    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allpets;

}
