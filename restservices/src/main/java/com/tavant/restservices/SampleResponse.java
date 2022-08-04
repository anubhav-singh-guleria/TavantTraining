package com.tavant.restservices;

public class SampleResponse {
    private long id;
    private String message;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public SampleResponse(long id, String message) {
        this.id = id;
        this.message = message;
    }
    
}
