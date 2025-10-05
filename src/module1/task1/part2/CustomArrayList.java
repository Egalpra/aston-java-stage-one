package module1.task1.part2;

import java.util.Collection;

public class CustomArrayList<T> {
    private Object[] objects;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public CustomArrayList() {
        size = 0;
        objects = new Object[INITIAL_CAPACITY];
    }

    public CustomArrayList(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Вместимость не может быть отрицательной: " + capacity);

        if (capacity == 0) {
            objects = new Object[0];
        } else {
            objects = new Object[capacity];
        }
        size = 0;
    }

    private void increaseCapacity() {
        int newCapacity = objects.length * 3 / 2 + 1;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < objects.length; i++) {
            newArray[i] = objects[i];
        }

        objects = newArray;
    }

    public boolean add(T element) {
        if (size == objects.length) {
            increaseCapacity();
        }

        objects[size] = element;
        size++;

        return true;
    }

    public T get(int index){
        if (index < 0 || index >= this.size) throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        return (T) objects[index];
    }

    public T remove(int index){
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        T removedElement = (T) objects[index];
        for (int i = index; i < size - 1; i++) {
            objects[i] = objects[i + 1];
        }
        objects[size - 1] = null;
        return removedElement;
    }

    public boolean addAll(Collection<? extends T> collection) {
        if (collection == null) {
            throw new NullPointerException("Переданная коллекция не может быть null");
        }

        if (collection.isEmpty()) {
            return false;
        }

        for (T element : collection) {
            add(element);
        }

        return true;
    }
}