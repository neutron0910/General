package example.com.bookfetcher;
//creating a class which consists of the information which we are gonna fetch
public class Book {

    public String name;
    public String author;
    public String price;

    public Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
