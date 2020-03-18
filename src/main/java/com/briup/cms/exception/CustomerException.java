package com.briup.cms.exception;

public class CustomerException extends RuntimeException {
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    public CustomerException(Integer code,String message){
        super(message);
        this.code=code;
    }
}
