package ru.aston.hometask.module3.task1.chainandbuilder;

public class NotifierChainBuilder {
    private Notifier first;
    private Notifier last;

    public NotifierChainBuilder() {
    }

    public NotifierChainBuilder addSimpleReport(Priority priority) {
        return addNotifier(new SimpleReportNotifier(priority));
    }

    public NotifierChainBuilder addEmailReport(Priority priority) {
        return addNotifier(new EmailNotifier(priority));
    }

    public NotifierChainBuilder addSMSReport(Priority priority) {
        return addNotifier(new SMSNotifier(priority));
    }

    private NotifierChainBuilder addNotifier(Notifier notifier) {
        if (first == null) {
            first = notifier;
        } else {
            last.setNextNotifier(notifier);
        }
        last = notifier;
        return this;
    }

    public Notifier build() {
        return first;
    }
}