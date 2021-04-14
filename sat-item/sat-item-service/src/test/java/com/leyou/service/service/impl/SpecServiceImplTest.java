package com.sat.service.service.impl;


import com.sat.item.pojo.SpecGroup;
import com.sat.service.service.SpecService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zx
 * @date 2021/04/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpecServiceImplTest {

    @Autowired
    private SpecService specService;

    @Test
    public void querySpecsByCid() {
        List<SpecGroup> groups = specService.querySpecsByCid(76L);
        for (SpecGroup group : groups) {
            System.out.println(group);
        }
    }
}