package module1.task1.part1;

public class Main {
    public static void main(String[] args) {
        CustomHashSet<String> one = new CustomHashSet<>();
        CustomHashSet<String> two = new CustomHashSet<>();

        one.add("Один-Один");
        one.add("Один-Два");
        one.add("Один-Три");
        one.add("Один-Четыре");
        one.add("Один-Пять");
        one.add("Один-Шесть");
        one.add("Один-Семь");
        one.add("Один-Восемь");
        one.add("Один-Девять");
        one.add("Один-Десять");
        one.add("Один-Одиннадцать");
        one.add("Один-Двенадцать");
        one.add("Один-Тринадцать");
        one.add("Один-Четырнадцать");
        one.add("Один-Пятнадцать");
        one.add("Один-Шестнадцать");
        one.add("Один-Семнадцать");

        two.add("Два-Один");
        two.add("Два-Два");
        two.add("Два-Три");
        two.add("Два-Четыре");
        two.add("Два-Пять");


        System.out.println(one.getSize());
        System.out.println(two.getSize());
    }
}