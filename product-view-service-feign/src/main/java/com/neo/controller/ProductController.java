package com.neo.controller;

import com.neo.pojo.Product;
import com.neo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description: TODO
 * @Author aaa
 * @Date 2019/10/14
 * @Version V1.0
 **/
@Controller
@RefreshScope//配置文件自动刷新
public class ProductController {
    @Autowired
    private ProductService productService;

    @Value("${version}")
    String version;

    @RequestMapping("/products")
    public Object products(Model model) {
        List<Product> products = productService.productList();
        model.addAttribute("version", version);
        model.addAttribute("ps", products);
        return "products";
    }
}
