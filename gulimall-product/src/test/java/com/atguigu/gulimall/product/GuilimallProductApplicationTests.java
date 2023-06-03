package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GuilimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    public void test() {
    }

}
