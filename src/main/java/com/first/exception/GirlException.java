package com.first.exception;

import com.first.Enum.ResEnum;

/**
 * Created by Hoperun on 2018/3/16.
 */
public class GirlException extends RuntimeException {
    private  Integer code;

    public GirlException (ResEnum resEnum) {
        super(resEnum.getMsg());
        this.code = resEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
