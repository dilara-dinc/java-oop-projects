import model.Book;
import service.LibraryService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LibraryService library = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add book");
            System.out.println("2. List books");
            System.out.println("3. Find book by ID");
            System.out.println("4. Remove book");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Author: ");
                    String author = scanner.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.listBooks();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int searchId = scanner.nextInt();

                    Book book = library.findBookById(searchId);

                    if (book != null) {
                        System.out.println(book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int removeId = scanner.nextInt();
                    library.removeBook(removeId);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
