package com.anatasia.birthdaygreetings.utils;

import com.anatasia.birthdaygreetings.model.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeParserUtils {
    public static Employee parseString(String s) {
        List<String> employeeInfo = Stream.of(s.split(","))
                .map(String:: trim)
                .collect(Collectors.toList());
        if (employeeInfo.size() != 4) {
            return null;
        }
        Employee employee = new Employee(employeeInfo.get(0), employeeInfo.get(1),
                employeeInfo.get(2), employeeInfo.get(3));
        return  employee;
    }
}
