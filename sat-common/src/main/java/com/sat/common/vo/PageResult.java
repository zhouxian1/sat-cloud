package com.sat.common.vo;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zx
 * @date 2021/04/14
 */
@Data
public class PageResult<T> {

    private Long total;
    private Integer totalPage;
    private List<T> items;

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }


}
