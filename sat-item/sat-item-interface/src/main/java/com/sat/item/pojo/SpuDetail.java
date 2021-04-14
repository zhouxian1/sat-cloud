package com.sat.item.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zx
 * @date 2021/04/14
 */
@Table(name = "tb_spu_detail")
@Data
public class SpuDetail {

    @Id
    private Long spuId;

    //商品描述
    private String description;

    //通用规格参数数据
    private String genericSpec;

    //特殊规格参数数据
    private String specialSpec;

    //包装清单
    private String packingList;

    //售后服务
    private String afterService;
}
