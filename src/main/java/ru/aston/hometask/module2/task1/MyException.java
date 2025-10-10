package ru.aston.hometask.module2.task1;

import java.io.IOException;

public class MyException extends IOException {
    public MyException() {
        super();
    }

    public MyException(String message, Throwable exception) {
        super(message, exception);
    }
}