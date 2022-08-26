package org.example.boot.bean;

/**
 * @BelongsProject: springboot-first
 * @BelongsPackage: org.example.boot.bean
 * @ClassName Pet
 * @Author: RookieFu
 * @CreateTime: 2022-08-22  19:32
 * @UpdateTime: 2022-08-22  19:32
 * @Description: TODO
 * @Version:
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 宠物
 */
@ToString
@Data
@NoArgsConstructor  //无参构造器
@AllArgsConstructor  //全参构造器
public class Pet {

    private String name;

}
