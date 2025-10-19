package ru.aston.hometask.module3.task1.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        super.saveObject();
    }

    @Override
    public void update() {
        super.updateObject();
    }

    @Override
    public void select() {
        super.loadObject();
    }

    @Override
    public void remove() {
        super.deleteObject();
    }
}