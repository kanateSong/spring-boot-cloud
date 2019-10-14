package com.neo.client;

import com.neo.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProductClientFeignHystrix
 * @Description: TODO
 * @Author aaa
 * @Date 2019/10/14
 * @Version V1.0
 **/
@Component//熔断器
public class ProductClientFeignHystrix implements ProductFeignClient {
    @Override
    public List<Product> products() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0,"产品数据微服务不可用",0));
        return result;
    }
}
