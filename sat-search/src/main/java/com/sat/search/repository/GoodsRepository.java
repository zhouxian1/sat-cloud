package com.sat.search.repository;

import com.sat.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zx
 * @date 2021/04/14
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}
