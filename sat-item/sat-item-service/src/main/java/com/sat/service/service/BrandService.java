package com.sat.service.service;

import com.sat.common.vo.PageResult;
import com.sat.item.pojo.Brand;
import com.sat.item.pojo.Category;
import com.sat.item.vo.BrandVo;

import java.util.List;

/**
 * @author zx
 * @date 2021/04/14
 */
public interface BrandService {

    PageResult<Brand> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key);

    void saveBrand(Brand brand, List<Long> cids);

    List<Category> queryCategoryByBid(Long bid);

    void updateBrand(BrandVo brandVo);

    void deleteBrand(Long bid);

    List<Brand> queryBrandByCid(Long cid);

    Brand queryBrandByBid(Long id);

    List<Brand> queryBrandByIds(List<Long> ids);

}
