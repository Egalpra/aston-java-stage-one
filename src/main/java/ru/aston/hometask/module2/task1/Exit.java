package ru.aston.hometask.module2.task1;

import java.util.Scanner;

public class Exit implements Handler {
    @Override
    public void handle(Scanner scanner) throws MyException {
        System.out.println("Закрываемся...");
        scanner.close();
        System.exit(0);
    }
}