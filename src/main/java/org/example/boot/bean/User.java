package org.example.boot.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @BelongsProject: springboot-first
 * @BelongsPackage: org.example.boot.bean
 * @ClassName User
 * @Author: RookieFu
 * @CreateTime: 2022-08-22  19:32
 * @UpdateTime: 2022-08-22  19:32
 * @Description: TODO
 * @Version:
 */
@NoArgsConstructor
//@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }


}
