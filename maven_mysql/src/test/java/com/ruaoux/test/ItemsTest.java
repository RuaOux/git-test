package com.ruaoux.test;

import com.ruaoux.dao.impl.ItemsDaoImpl;
import com.ruaoux.domain.Items;
import org.junit.Test;

import java.util.List;

public class ItemsTest {
    @Test
    public void findAll() throws Exception {
        ItemsDaoImpl dao = new ItemsDaoImpl();
        List<Items> list = dao.findAll();
        for (Items items : list) {
            System.out.println(items.getEname() + ":" + items.getId());
        }
    }
}
