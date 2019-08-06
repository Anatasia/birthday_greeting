package com.anatasia.birthdaygreetings.model;

public class Email {
    private String subject;
    private String address;
    private String message;
    public Email(String address, String subject, String message) {
        this.address = address;
        this.subject = subject;
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }
    public String getMessage() {
        return message;
    }

}
