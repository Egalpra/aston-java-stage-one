package ru.aston.hometask.module3.task1.strategy;

import java.util.logging.Logger;

public class Reading implements Activity {
    private static final Logger logger = Logger.getLogger(Reading.class.getName());

    @Override
    public void justDoIt() {
        logger.info("Reading...");
    }
}