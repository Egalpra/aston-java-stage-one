package ru.aston.hometask.module3.task1.chainandbuilder;

public enum Priority {

    ROUTINE(0),
    IMPORTANT(1),
    ASAP(2);

    private final int level;

    Priority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}