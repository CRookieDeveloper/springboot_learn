package com.example.boot.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @BelongsProject: springboot-first
 * @BelongsPackage: com.example.boot.bean
 * @ClassName Pet
 * @Author: RookieFu
 * @CreateTime: 2022-08-25  19:38
 * @UpdateTime: 2022-08-25  19:38
 * @Description: TODO
 * @Version:
 */
@ToString
@Data
public class Pet {
    private String name;
    private Double weight;
}
