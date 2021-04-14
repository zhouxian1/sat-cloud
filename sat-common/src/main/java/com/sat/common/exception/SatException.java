package com.sat.common.exception;

import com.sat.common.enums.ExceptionEnum;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @author zx
 * @date 2021/04/14
 *
 * 自定义异常类
 */
@Getter
public class SatException extends RuntimeException {

    private ExceptionEnum exceptionEnum;

    public SatException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }


}
