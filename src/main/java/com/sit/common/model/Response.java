package com.sit.common.model;

public class Response {
    private boolean success;
    private String resultCode;
    private String message;
    private Object data;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Response() {
    }

    public Response(boolean success, String resultCode, String message) {
        this.success = success;
        this.resultCode = resultCode;
        this.message = message;
    }

    public Response(boolean success, String resultCode, String message, Object data) {
        this.success = success;
        this.resultCode = resultCode;
        this.message = message;
        this.data = data;
    }
}
