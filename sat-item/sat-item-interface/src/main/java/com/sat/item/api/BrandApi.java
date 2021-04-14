package com.sat.item.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * @author zx
 * @date 2021/04/14
 */
public interface BrandApi {

    @GetMapping("brand/{id}")
    Object queryById(@PathVariable("id") Long id);

}
