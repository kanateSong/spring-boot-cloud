package com.neo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Product
 * @Description: TODO
 * @Author aaa
 * @Date 2019/10/14
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;

}

