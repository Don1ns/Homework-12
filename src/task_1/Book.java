package task_1;

import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationData;

    public Book(String title, Author author, int publicationData) {
        this.title = title;
        this.author = author;
        this.publicationData = publicationData;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationData() {
        return this.publicationData;
    }

    public void setPublicationData(int publicationData) {
        this.publicationData = publicationData;
    }

    @Override
    public String toString() {
        return author + " - автор книги \""+ title + "\" " + publicationData + "-го года.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationData == book.publicationData && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationData);
    }
}
