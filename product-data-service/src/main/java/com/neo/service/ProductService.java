package com.neo.service;

import com.neo.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Product
 * @Description: TODO
 * @Author aaa
 * @Date 2019/10/14
 * @Version V1.0
 **/
@Service
public class ProductService {

    @Value("${server.port}")
    String port;

    public List<Product> productList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "product a from port:" + port, 50));
        products.add(new Product(2, "product b from port:" + port, 100));
        products.add(new Product(3, "product c from port:" + port, 150));
        return products;
    }
}
