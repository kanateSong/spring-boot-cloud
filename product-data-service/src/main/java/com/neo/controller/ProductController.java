package com.neo.controller;

import com.neo.pojo.Product;
import com.neo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description: TODO
 * @Author aaa
 * @Date 2019/10/14
 * @Version V1.0
 **/
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products() {
        List<Product> products = productService.productList();
        return products;
    }
}
