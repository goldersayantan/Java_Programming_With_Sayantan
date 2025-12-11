import java.util.Scanner;

class Book  {
    String id;
    String Title;
    String author;
    boolean isAvailable;

    Book(String id, String Title, String Author)  {
        this.id = id;
        this.Title = Title;
        this.author = Author;
        this.isAvailable = true;
    }

    public void display()   {
        System.out.println("ID : " + id);
        System.out.println("Title : " + Title);
        System.out.println("Author : " + author);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
    }
}

class LibraryManagementSystem   {
    static Book[] books = new Book[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        while(true) {
            System.out.println("Welcome To The Library Management System");
            System.out.println("1. Display Books");
            System.out.println("2. Search Books");
            System.out.println("3. Add Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    displayAllBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    addBook();
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }

    static void addBook()   {
        if(count >= books.length) {
            System.out.println("The library is full, Can't add more books..");
            return;
        }
        System.out.print("Enter the book id: ");
        String id = sc.nextLine();
        System.out.print("Enter the Title of the book : ");
        String title = sc.nextLine();
        System.out.print("Enter the author name : ");
        String author = sc.nextLine();
        books[count] = new Book(id, title, author);
        System.out.println("Book added Successfully.");
        count++;
    }

    static void searchBook()    {
        System.out.print("Enter the book id: ");
        String id = sc.nextLine();
        for(int i = 0; i < count; i++)   {
            if(id.equals(books[i].id))   {
                books[i].display();
                return;
            }
        }
        System.out.println("Book Not found,");
    }

    static void issueBook() {
        System.out.print("Enter the book id : ");
        String id = sc.nextLine();

        for(int i = 0; i < count; i++)   {
            if(id.equals(books[i].id))   {
                if(books[i].isAvailable)    {
                    books[i].isAvailable = false;
                    books[i].display();
                    System.out.println("Book issued successfully.");
                }else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book Not found,");
    }

    static void returnBook()    {
        System.out.print("Enter the book id: ");
        String id = sc.nextLine();
        for(int i = 0; i < count; i++)   {
            if(id.equals(books[i].id))   {
                if(!books[i].isAvailable)   {
                    books[i].isAvailable = true;
                    books[i].display();
                    System.out.println("Book returned successfully.");
                }else {
                    System.out.println("Book is already returned.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void displayAllBook()    {
        if(count == 0)  {
            System.out.println("No book in the library.");
            return;
        }
        for(int i = 0; i < count; i++)   {
            books[i].display();
        }
    }
}