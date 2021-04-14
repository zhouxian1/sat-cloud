package com.sat.search.client;

import com.sat.item.api.SpecApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zx
 * @date 2021/04/14
 */
@FeignClient("item-service")
public interface SpecClient extends SpecApi {
}
