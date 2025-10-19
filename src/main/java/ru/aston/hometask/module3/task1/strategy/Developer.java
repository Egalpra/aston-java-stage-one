package ru.aston.hometask.module3.task1.strategy;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;

    }

    public void executeActivity() {
        activity.justDoIt();
    }

}