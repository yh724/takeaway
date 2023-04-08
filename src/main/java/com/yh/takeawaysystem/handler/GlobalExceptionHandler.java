package com.yh.takeawaysystem.handler;

import com.yh.takeawaysystem.exception.GlobalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @decription 全局异常捕获类，会捕获程序中抛出的自定义{@link GlobalException} 异常，并返回错误信息给前端
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = GlobalException.class)
    public ResponseEntity<String> exceptionHandler(GlobalException exception) {
        return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
    }
}
