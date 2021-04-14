package com.sat.common.vo;

import com.sat.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @author zx
 * @date 2021/04/14
 *
 * 自定义异常结果类
 */

@Data
public class ExceptionResult {

    private int status;

    private String message;

    private long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.value();
        this.message = em.message();
        this.timestamp = System.currentTimeMillis();
    }
}
