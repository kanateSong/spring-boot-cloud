package com.neo.client;

import com.neo.pojo.Product;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @ClassName ProductFeignClient
 * @Description: TODO
 * @Author aaa
 * @Date 2019/10/14
 * @Version V1.0
 **/

//fallback：访问的 PRODUCT-DATA-SERVICE 不可用的话，就调用 ProductClientFeignHystrix 来进行反馈信息。
@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
public interface ProductFeignClient {

    @GetMapping("/products")
    public List<Product> products();


}
