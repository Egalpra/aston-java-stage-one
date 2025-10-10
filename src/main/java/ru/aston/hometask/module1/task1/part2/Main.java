package ru.aston.hometask.module1.task1.part2;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> one = new CustomArrayList<>();
        CustomArrayList<String> two = new CustomArrayList<>(10);

        one.add("one");
        one.add("two");
        one.add("three");

        System.out.println(one.get(1));

        one.remove(1);
        System.out.println(one.get(1));

        two.add("one");
        two.add("two");
        two.add("three");
        two.add("four");
        two.add("five");
        two.add("six");
        two.add("seven");
        two.add("eight");
        two.add("nine");
        two.add("ten");
        two.add("eleven");
        two.add("twelve");

        System.out.println(two.get(11));
    }
}