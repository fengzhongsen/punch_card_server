package com.sit.common.model;

public class ResponseBuilder {
    private boolean success;
    private String resultCode;
    private String message;
    private Object data;

    public ResponseBuilder() {
    }

    public Response build() {
        return new Response(this.success, this.resultCode, this.message, this.data);
    }

    public static Response buildSuccess() {
        return new Response(true, "0000000", "");
    }

    public static Response buildSuccess(String message, Object data) {
        return new Response(true, "0000000", message, data);
    }

    public static Response buildFail() {
        return new Response(false, "0000001", "");
    }

    public static Response buildFail(String message) {
        return new Response(false, "0000001", message);
    }

    public static Response buildFail(String message, String resultCode) {
        return new Response(false, resultCode, message);
    }

    public ResponseBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResponseBuilder setData(Object data) {
        this.data = data;
        return this;
    }

    public ResponseBuilder setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    public ResponseBuilder setSuccess(boolean success) {
        this.success = success;
        return this;
    }
}
