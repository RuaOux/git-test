package com.ruaoux.test;

import com.ruaoux.domain.Item;
import com.ruaoux.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"})
public class SpringMybatisTest {

    @Autowired
    private ItemService itemService;

    @Test
    public void test(){
        Item item = itemService.findById(1);
        System.out.println(item);
    }

}
