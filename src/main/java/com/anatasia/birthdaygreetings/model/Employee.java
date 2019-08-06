package com.anatasia.birthdaygreetings.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Employee {
    private String lastName;
    private String firstName;
    private String birthday;
    private String email;

    public Employee(String lastName, String firstName, String birthday, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.email =email;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getEmail() {
        return email;
    }


    public boolean isBirthday() {
        LocalDate birth = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        LocalDate today = LocalDate.now();
        if (!Objects.equals(birth.getMonth(), today.getMonth())) {
            return false;
        }
        if (!Objects.equals(birth.getDayOfMonth(), today.getDayOfMonth())) {
            return false;
        }
        return true;
    }
}
