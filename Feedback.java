package com.example.myapplication;

public class Feedback {
    private String id;
    private String message;
    private String timestamp;

    public Feedback() {
        // Default constructor required for calls to DataSnapshot.getValue(Feedback.class)
    }

    public Feedback(String id, String message, String timestamp) {
        this.id = id;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}

