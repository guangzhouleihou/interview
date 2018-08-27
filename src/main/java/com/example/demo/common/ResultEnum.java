package com.example.demo.common;

public enum ResultEnum {
    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败");
    private int code;
    private String msg;

    private ResultEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
