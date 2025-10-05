package module1.task2;

import java.util.Objects;

public class Book {
    private int pageCount;
    private int publishYear;
    private String title;
    private String author;

    public Book(String title, String author, int publishYear, int pageCount){

        if (pageCount < 0) throw new IllegalArgumentException ("Отрицательное количество страниц!");
        if (publishYear < 0) throw new IllegalArgumentException ("Отрицательный год выхода!");

        this.pageCount = pageCount;

        if (title == null || title.equals(""))
        {
            this.title = "unknown";
        } else {
            this.title = title;
        }

        if (author == null || author.equals(""))
        {
            this.author = "unknown";
        } else {
            this.author = author;
        }

        this.publishYear = publishYear;

    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getPageCount(){
        return this.pageCount;
    }

    public int getPublishYear(){
        return publishYear;
    }

    @Override
    public String toString() {
        return title + " (" + publishYear + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount &&
                publishYear == book.publishYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishYear, pageCount);
    }
}