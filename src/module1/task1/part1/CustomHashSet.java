package module1.task1.part1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class CustomHashSet<E> {
    private LinkedList<E>[] buckets;
    private int size;
    private double threshold;
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private static final double INITIAL_THRESHOLD = INITIAL_CAPACITY * LOAD_FACTOR;

    public CustomHashSet() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        size = 0;
        threshold = INITIAL_THRESHOLD;
    }

    public boolean add(E newElement) {

        int index = calculateIndex(newElement);

        LinkedList<E> bucket = buckets[index];

        if (bucket == null) {
            bucket = new LinkedList<>();
            buckets[index] = bucket;
        }

        for (E bucketElement : bucket) {
            if (Objects.equals(bucketElement, newElement)) {
                return false;
            }
        }

        bucket.add(newElement);
        size++;
        if (size > threshold) resize();
        return true;
    }

    public boolean remove(E element) {
        int index = calculateIndex(element);

        LinkedList<E> bucket = buckets[index];
        if (bucket != null && !bucket.isEmpty()) {
            Iterator<E> iterator = bucket.iterator();
            while (iterator.hasNext()) {
                E currentElement = iterator.next();
                if (Objects.equals(currentElement, element)) {
                    iterator.remove();
                    size--;
                    if (bucket.isEmpty()) {
                        buckets[index] = null;  // ← Очищаем пустую корзину
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    private int calculateIndex(E element) {

        if (element == null) return 0;

        int hashCode = element.hashCode();
        return Math.abs(hashCode % buckets.length);
    }

    private void resize() {
        int newCapacity = buckets.length * 2;
        threshold = Double.MAX_VALUE;
        LinkedList<E>[] oldBuckets = buckets;
        buckets = new LinkedList[newCapacity];

        size = 0;
        for (LinkedList<E> bucket : oldBuckets) {
            if (bucket != null && !bucket.isEmpty()) {
                for (E element : bucket) {
                    add(element);
                }
            }
        }
        threshold = newCapacity * LOAD_FACTOR;

    }
}