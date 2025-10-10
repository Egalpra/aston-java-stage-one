package ru.aston.hometask.module2.task1;

import java.util.EnumMap;
import java.util.Scanner;

public class Main {
    private static final EnumMap<UserChoice, Handler> HANDLERS = new EnumMap<>(UserChoice.class);

    static {
        HANDLERS.put(UserChoice.READ, new Reader());
        HANDLERS.put(UserChoice.WRITE, new Writer());
        HANDLERS.put(UserChoice.EXIT, new Exit());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Что вы хотите сделать?");
                System.out.println("read -> прочитать файл");
                System.out.println("write -> записать в файл");
                System.out.println("exit -> выйти из программы");

                String command = scanner.nextLine();

                UserChoice userChoice = UserChoice.valueOf(command.toUpperCase());
                Handler handler = HANDLERS.get(userChoice);
                handler.handle(scanner);

            } catch (IllegalArgumentException e) {
                System.out.println("Такой команды не существует.");
            } catch (MyException e) {
                System.out.println("Ошибка выполнения: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Неожиданная ошибка: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }
}