package task_1;

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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book compareBook = (Book) other;
        return title.equals(compareBook.title) & author.equals(compareBook.author) & publicationData == compareBook.publicationData;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, publicationData);
    }
}
