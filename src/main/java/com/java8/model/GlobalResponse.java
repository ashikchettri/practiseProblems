package com.java8.model;

public class GlobalResponse<T> {

    private int status;
    private String message;
    private T data;

    public GlobalResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public GlobalResponse() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage() {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData() {
        this.data = data;
    }


}
