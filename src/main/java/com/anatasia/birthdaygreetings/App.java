/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.anatasia.birthdaygreetings;

import com.anatasia.birthdaygreetings.model.Email;
import com.anatasia.birthdaygreetings.model.Employee;
import com.anatasia.birthdaygreetings.service.EmailService;
import com.anatasia.birthdaygreetings.utils.EmployeeParserUtils;
import com.anatasia.birthdaygreetings.utils.FileUtils;

import java.util.List;

public class App {
    private static final String filePath = "employee_records.txt";
    public static void main(String[] args) {
        List<String> lists = FileUtils.readFile(filePath);
        String subject = "Happy birthday!";
        EmailService emailService = new EmailService();
        lists.forEach(list-> {
            Employee employee = EmployeeParserUtils.parseString(list);
            if (employee.isBirthday()) {
                Email email = new Email(employee.getEmail(), subject, "Happy birthday,dear "
                        + employee.getFirstName() +"!");
                emailService.send(email);
            }
        });
    }
}