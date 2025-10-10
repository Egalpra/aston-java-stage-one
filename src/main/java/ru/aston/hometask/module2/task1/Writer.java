package ru.aston.hometask.module2.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Writer implements Handler {
    @Override
    public void handle(Scanner scanner) throws MyException {
        System.out.print("Введите путь к файлу: ");
        String path = scanner.nextLine();

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        if (path == null || path.trim().isEmpty()) {
            throw new MyException("Необходимо задать путь к файлу", null);
        }
        if (text.trim().isEmpty()) {
            throw new MyException("Необходимо указать текст для записи", null);
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
            writer.print(text);
            System.out.println("Текст успешно записан в файл.");
        } catch (IOException e) {
            throw new MyException("Ошибка при записи файла: " + e.getMessage(), e);
        }
    }
}