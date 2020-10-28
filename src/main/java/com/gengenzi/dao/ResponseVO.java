package com.gengenzi.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ResponseVO<T> {
    /**
     * 响应相应码
     */
    private int code;
    /**
     * 响应相应信息
     */
    private String msg;
    /**
     * 业务结果
     */
    private T obj;

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

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
