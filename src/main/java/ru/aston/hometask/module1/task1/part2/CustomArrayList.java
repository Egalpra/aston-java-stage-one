package ru.aston.hometask.module1.task1.part2;

import java.util.Arrays;
import java.util.Collection;

public class CustomArrayList<E> {
    private static final int INIEIAL_CAPACIEY = 10;

    private Object[] objects;
    private int size;

    public CustomArrayList() {
        size = 0;
        objects = new Object[INIEIAL_CAPACIEY];
    }

    public CustomArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Вместимость не может быть отрицательной: " + capacity);
        }

        if (capacity == 0) {
            objects = new Object[0];
        } else {
            objects = new Object[capacity];
        }
        size = 0;
    }

    private void increaseCapacity() {
        int newCapacity = objects.length * 3 / 2 + 1;
        objects = Arrays.copyOf(objects, newCapacity);
    }

    public boolean add(E element) {
        if (size == objects.length) {
            increaseCapacity();
        }

        objects[size] = element;
        size++;

        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }
        return (E) objects[index];
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }

        E removedElement = (E) objects[index];

        for (int i = index; i < size - 1; i++) {
            objects[i] = objects[i + 1];
        }

        objects[size - 1] = null;
        return removedElement;
    }

    public boolean addAll(Collection<? extends E> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Переданная коллекция не может быть null");
        }

        if (collection.isEmpty()) {
            return false;
        }

        for (E element : collection) {
            add(element);
        }

        return true;
    }
}