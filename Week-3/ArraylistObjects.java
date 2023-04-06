import java.util.ArrayList;
import java.util.List;

class Book{
    private String title;
    private String author;
 
    public Book(String title,
                String author) {
        this.title = title;
        this.author = author;
    }
 
    public String getTitle() {
        return title;
    }
 
    public String getAuthor() {
        return author;
    }
 
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + "'" + '\n' +
                '}';
    }
}

class ArraylistObjects{
    public static void main(String[] args) {
        
        List<Book> listOfBooks =new ArrayList<>();
 
        Book javaInAction = new Book("Java in action", "mary public");
        Book introductionToJava =  new Book("Introduction to Java", "mary public");
        Book advancedDatabases =  new Book("Advanced databases", "charles darwin");
 
        listOfBooks.add(javaInAction);
        listOfBooks.add(introductionToJava);
        listOfBooks.add(advancedDatabases);
 
        System.out.println(listOfBooks);
    }
}