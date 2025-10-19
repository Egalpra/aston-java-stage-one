package ru.aston.hometask.module3.task1.chainandbuilder;

import java.util.logging.Logger;

public class SimpleReportNotifier extends Notifier {
    private static final Logger logger = Logger.getLogger(SimpleReportNotifier.class.getName());

    public SimpleReportNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        logger.info("Sending SIMPLE REPORT: " + message);
    }
}