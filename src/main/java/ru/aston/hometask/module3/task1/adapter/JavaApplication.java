package ru.aston.hometask.module3.task1.adapter;

import java.util.logging.Logger;

public class JavaApplication {
    private static final Logger logger = Logger.getLogger(JavaApplication.class.getName());

    public void saveObject() {
        logger.info("Saving Java Object...");
    }

    public void updateObject() {
        logger.info("Opdating Java Object...");
    }

    public void loadObject() {
        logger.info("Loading Java Object...");
    }

    public void deleteObject() {
        logger.info("Deleting Java Object...");
    }
}