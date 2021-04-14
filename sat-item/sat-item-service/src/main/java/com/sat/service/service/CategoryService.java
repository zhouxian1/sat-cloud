package com.sat.service.service;

import com.sat.item.pojo.Category;

import java.util.List;

/**
 * @author zx
 * @date 2021/04/14
 */
public interface CategoryService {


    List<Category> queryCategoryByPid(Long pid);

    List<Category> queryCategoryByIds(List<Long> ids);

    List<Category> queryAllByCid3(Long id);
}
