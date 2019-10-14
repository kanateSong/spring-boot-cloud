package com.neo.client;

import com.neo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName ProductClientRibbon
 * @Description: TODO
 * @Author aaa
 * @Date 2019/10/14
 * @Version V1.0
 **/
@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;//表示用 restTemplate 这个工具来做负载均衡

    public List<Product> listProducts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products", List.class);
    }
}
