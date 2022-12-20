package task_1;

public class Book {
    private String title;
    private Author author;
    private int publicationData;

    public Book(String title, Author author, int publicationData){
        this.title = title;
        this.author = author;
        this.publicationData = publicationData;
    }

    public String getTitle(){
        return this.title;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getPublicationData(){
        return this.publicationData;
    }

    public void setPublicationData(int publicationData){
        this.publicationData = publicationData;
    }
}
