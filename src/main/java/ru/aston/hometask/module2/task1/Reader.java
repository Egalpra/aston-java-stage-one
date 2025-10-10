package ru.aston.hometask.module2.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader implements Handler {
    @Override
    public void handle(Scanner scanner) throws MyException {
        System.out.print("Введите путь к файлу: ");
        String path = scanner.nextLine();

        if (path == null || path.trim().isEmpty()) {
            throw new MyException("Необходимо задать путь к файлу", null);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new MyException("Ошибка при чтении файла: " + e.getMessage(), e);
        }
    }
}