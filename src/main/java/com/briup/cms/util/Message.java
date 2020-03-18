package com.briup.cms.util;

public class Message<T> {
    /*
     * 返回信息
     */
    private String message;

    /**
     * 状态码
     */

    private Integer status;

    /*
     * 返回的数据类型
     */
    private T data;

    /**
     * 时间
     */
    private Long time;

    public Message(){
    }

    public Message(String message, Integer status, T data,Long time) {
        this.message = message;
        this.status = status;
        this.data = data;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", data=" + data +
                ", time=" + time +
                '}';
    }
}
