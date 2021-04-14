package com.sat.search.web;

import com.sat.common.vo.PageResult;
import com.sat.search.pojo.Goods;
import com.sat.search.pojo.SearchRequest;
import com.sat.search.pojo.SearchResult;
import com.sat.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zx
 * @date 2021/04/14
 */
@RestController
public class GoodsSearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("page")
    public ResponseEntity<SearchResult<Goods>> search(@RequestBody SearchRequest searchRequest) {
        return ResponseEntity.ok(searchService.search(searchRequest));
    }
}
