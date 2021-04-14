package com.sat.search.client;

import com.sat.item.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


/**
 * @author zx
 * @date 2021/04/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryClientTest {

    @Autowired
   private CategoryClient categoryClient;

    @Test
    public void testQueryCategory() {
        List<Category> list = categoryClient.queryByIds(Arrays.asList(1L, 2L, 3L));
        list.forEach(System.out::println);
    }

}