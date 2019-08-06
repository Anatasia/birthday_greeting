package com.anatasia.birthdaygreetings.service;

import com.anatasia.birthdaygreetings.model.Email;

public class EmailService {
    public void send(Email email) {
        System.out.println("Subject:" + email.getSubject());
        System.out.println(email.getMessage());
    }
}
