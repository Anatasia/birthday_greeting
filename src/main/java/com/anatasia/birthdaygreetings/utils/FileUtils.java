package com.anatasia.birthdaygreetings.utils;

import sun.rmi.runtime.Log;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {
    public static List<String> readFile(String filePath) {
        List<String> list = null;
        Path path = Paths.get(filePath);
        try {
            list = Files.readAllLines(path);
        } catch (IOException e) {
        }
        return  list;
    }
}
