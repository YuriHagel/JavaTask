package Task003;

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        author.setAuthor("Fyodor Dostoevsky");
        title.setTitle("Crime and Punishment");
        content.setContent("Social-Philosophy");

        author.show();
        title.show();
        content.show();


    }
}
