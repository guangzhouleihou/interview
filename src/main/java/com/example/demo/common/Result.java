package com.example.demo.common;

/**
 * 同意封装返回信息
 */
public class Result {
    //返回状态
    private int code;
    //返回描述
    private String msg;
    //返回信息
    private Object obj;

    public Result(int code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.obj = null;
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

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
