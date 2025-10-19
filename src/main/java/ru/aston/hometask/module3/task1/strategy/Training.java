package ru.aston.hometask.module3.task1.strategy;

import java.util.logging.Logger;

public class Training implements Activity {
    private static final Logger logger = Logger.getLogger(Training.class.getName());

    @Override
    public void justDoIt() {
        logger.info("Training...");
    }
}