package com.lala.xiguamall.product;

import com.lala.xiguamall.product.entity.BrandEntity;
import com.lala.xiguamall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XiguamallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");

        String s = brandService.save(brandEntity) == true ? "成功":"失败";
        //brandService.query();
        System.out.println(s);
    }

}
