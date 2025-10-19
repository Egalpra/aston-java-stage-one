package ru.aston.hometask.module3.task1.chainandbuilder;

public class Main {
    public static void main(String[] args) {

        Notifier chain = new NotifierChainBuilder()
                .addSimpleReport(Priority.ROUTINE)
                .addEmailReport(Priority.IMPORTANT)
                .addSMSReport(Priority.ASAP)
                .build();

        chain.notifyManager("This is a routine test", Priority.ROUTINE);
        chain.notifyManager("This is an important test", Priority.IMPORTANT);
        chain.notifyManager("This is an asap test", Priority.ASAP);
    }
}