package com.sat.service.service;

import com.sat.common.vo.PageResult;
import com.sat.item.dto.CartDto;
import com.sat.item.pojo.Sku;
import com.sat.item.pojo.Spu;
import com.sat.item.pojo.SpuDetail;

import java.util.List;

/**
 * @author zx
 * @date 2021/04/14
 */
public interface GoodsService {
    PageResult<Spu> querySpuByPage(Integer page, Integer rows, String key, Boolean saleable);

    SpuDetail querySpuDetailBySpuId(Long spuId);

    List<Sku> querySkuBySpuId(Long spuId);

    void deleteGoodsBySpuId(Long spuId);

    void addGoods(Spu spu);

    void updateGoods(Spu spu);

    void handleSaleable(Spu spu);

    Spu querySpuBySpuId(Long spuId);

    List<Sku> querySkusByIds(List<Long> ids);

    void decreaseStock(List<CartDto> cartDtos);
}
