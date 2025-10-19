package ru.aston.hometask.module3.task1.chainandbuilder;

public abstract class Notifier {
    private Priority priority;
    private Notifier nextNotifier;

    public Notifier(Priority priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, Priority level) {
        if (level.getLevel() == priority.getLevel()) {
            send(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void send(String message);
}