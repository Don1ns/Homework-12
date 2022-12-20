package task_1;

public class Main {
    public static void main(String[] args) {
        Author bradbury = new Author("Рэй", "Брэдбери");
        Author murakami = new Author("Харуки", "Мураками");
        Book firstBook = new Book("451 градус по Фаренгейту", bradbury, 1953);
        Book secondBook = new Book("Мой любимый sputnik", murakami, 1999);
        firstBook.setPublicationData(2018);
    }
}
