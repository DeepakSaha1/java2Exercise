// 1. Create Java classes having suitable attributes for Library management system.
// Use OOPs concepts in your design. Also try to use interfaces and abstract classes.
import java.util.Scanner;

class Librarian implements Library {
    String name;
    int id;
    static int bookscount=0;

    @Override
    public void issueBooks() {
        System.out.println("Only 1 book can be issued per user");
        Scanner sc =new Scanner(System.in);
        if(bookscount == 0) {
          System.out.println("Enter Book Name : ");
          name = sc.next();
          System.out.println("Enter Book Id : ");
          id = sc.nextInt();
          bookscount++;
          System.out.println("Total Books Issued: " + bookscount);
        } else {
          System.out.println("please retured past issued book..");
        }

    }

    @Override
    public void returnBooks() {
      if(bookscount == 0) {
        System.out.println("No issued book to return");
      } else {
        System.out.println("books returned successfully");
        bookscount--;
        System.out.println("Total Books Issued: " + bookscount);
      }
    }

    @Override
    public void showBooks() {
      if(name == null)
        System.out.println("No book Issued");
      else {
        System.out.println("Issued Book Name: " + name);
        System.out.println("Issued Book Id: " + id);
      }
    }
}

class LibraryMangSys {
    public static void main(String args[]) {
        Librarian librarian = new Librarian();
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Issue books");
            System.out.println("2. Return books");
            System.out.println("3. Show book details");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    librarian.issueBooks();
                    break;
                case 2:
                    librarian.returnBooks();
                    break;
                case 3:
                    librarian.showBooks();
                    break;
                default:
                  System.out.println("Happy Hours..");
            }
        } while (choice >=1 && choice <4);
    }
}

interface Library {
    void issueBooks();
    void returnBooks();
    void showBooks();
}
