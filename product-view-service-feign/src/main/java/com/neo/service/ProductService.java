package com.neo.service;

import com.neo.client.ProductFeignClient;
import com.neo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description: TODO
 * @Author aaa
 * @Date 2019/10/14
 * @Version V1.0
 **/
@Service
public class ProductService {

    @Autowired
    ProductFeignClient productFeignClient;

    public List<Product> productList() {
        return productFeignClient.products();
    }
}
