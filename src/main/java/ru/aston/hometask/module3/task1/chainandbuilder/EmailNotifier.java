package ru.aston.hometask.module3.task1.chainandbuilder;

import java.util.logging.Logger;

public class EmailNotifier extends Notifier {
    private static final Logger logger = Logger.getLogger(EmailNotifier.class.getName());

    public EmailNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        logger.info("Sending EMAIL: " + message);
    }
}