package com.first.Enum;

/**
 * Created by Hoperun on 2018/3/16.
 */
public enum ResEnum {
    UN_KNOW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOOL(100, "小学"),
    MIDDLE_SCHOOL(101, "初中");

    private Integer code;
    private String msg;

    ResEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
