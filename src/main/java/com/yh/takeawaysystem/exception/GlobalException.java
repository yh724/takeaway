package com.yh.takeawaysystem.exception;

public class GlobalException extends RuntimeException {
    private ExceptionEnums exceptionEnums;

    public GlobalException(ExceptionEnums exceptionEnums) {
        super(exceptionEnums.getMessage());
        this.exceptionEnums = exceptionEnums;
    }
}
