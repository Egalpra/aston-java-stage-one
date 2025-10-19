package ru.aston.hometask.module3.task1.chainandbuilder;

import java.util.logging.Logger;

public class SMSNotifier extends Notifier {
    private static final Logger logger = Logger.getLogger(SMSNotifier.class.getName());

    public SMSNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        logger.info("Sending SMS: " + message);
    }
}