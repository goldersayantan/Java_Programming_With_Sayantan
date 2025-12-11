//Create a class Book with attributes title and author. Write a method to display book details.

public class BookClass {
    String title;
    String author;

    void displayDetails()   {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args)  {
        BookClass b1 = new BookClass();
        b1.title = "Harry Potter";
        b1.author = "JK Rowling";
        b1.displayDetails();
    }
}



