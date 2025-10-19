package ru.aston.hometask.module1.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("title1", "author1", 1994, 200);
        Book book2 = new Book("title2", "author2", 1984, 300);
        Book book3 = new Book("title3", "author3", 1974, 400);
        Book book4 = new Book("title4", "author4", 1964, 500);
        Book book5 = new Book("title5", "author5", 2010, 250);
        Book book6 = new Book("title6", "author6", 2005, 350);
        Book book7 = new Book("title7", "author7", 2008, 450);
        Book book8 = new Book("title8", "author8", 2015, 150);
        Book book9 = new Book("title9", "author9", 2003, 600);
        Book book10 = new Book("title10", "author10", 1999, 700);

        // Создаем студентов с книгами (минимум 5 книг у каждого)
        List<Student> students = List.of(
                new Student("Student1", Arrays.asList(book1, book2, book5, book6, book9)),
                new Student("Student2", Arrays.asList(book3, book4, book7, book8, book10)),
                new Student("Student3", Arrays.asList(book1, book5, book6, book7, book8))
        );

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPageCount))
                .distinct()
                .filter(book -> book.getPublishYear() > 2000)
                .limit(3)
                .map(Book::getPublishYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Книга отсутствует")
                );
    }
}