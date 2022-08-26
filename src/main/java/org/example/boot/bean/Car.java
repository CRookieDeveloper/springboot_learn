package org.example.boot.bean;

/**
 * @BelongsProject: springboot-first
 * @BelongsPackage: org.example.boot.bean
 * @ClassName Car
 * @Author: RookieFu
 * @CreateTime: 2022-08-22  19:33
 * @UpdateTime: 2022-08-22  19:33
 * @Description: TODO
 * @Version:
 */
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 */
@ToString
@Data
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;
    private Integer price;


}