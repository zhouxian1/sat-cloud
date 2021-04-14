package com.sat.service.mapper;

import com.sat.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author zx
 * @date 2021/04/14
 */
public interface CategoryMapper extends Mapper<Category>, IdListMapper<Category, Long> {
}
