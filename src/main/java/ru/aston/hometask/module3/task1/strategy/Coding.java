package ru.aston.hometask.module3.task1.strategy;

import java.util.logging.Logger;

public class Coding implements Activity {
    private static final Logger logger = Logger.getLogger(Coding.class.getName());

    @Override
    public void justDoIt() {
        logger.info("Coding...");
    }
}