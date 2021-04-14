package com.sat.order.client;

import com.sat.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zx
 * @date 2021/04/14
 */
@FeignClient(value = "item-service")
public interface GoodsClient extends GoodsApi {
}
