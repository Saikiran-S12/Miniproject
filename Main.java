import java.util.Scanner;

public class Main {

    static final int PASS = 1;
    static final int FAIL = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id, choice, success = -1;
        String name, authorname;

        System.out.println("\n\t\t\t\t*************** MAIN MENU ***************");
        System.out.println("\n\t\t\t\t1. Add Books");
        System.out.println("\n\t\t\t\t2. Delete books");
        System.out.println("\n\t\t\t\t3. View Books");
        System.out.println("\n\t\t\t\t4. Search book");
        System.out.println("\n\t\t\t\t5. Issue books");
        System.out.println("\n\t\t\t\t6. Close Application");
        System.out.println("\n\t\t\t\t******************************************");
        System.out.print("\n\t\t\t\tEnter your choice: ");
        choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        switch(choice) {
            case 1:
                System.out.print("\nBookId: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("\nBook name: ");
                name = sc.nextLine();
                System.out.print("Author name: ");
                authorname = sc.nextLine();
                success = LibraryManagementSystem.addition(id, name, authorname);
                break;
            case 2:
                System.out.print("\nBookId: ");
                id = sc.nextInt();
                success = LibraryManagementSystem.deletebook(id);
                break;
            case 3:
                success = LibraryManagementSystem.viewbook();
                break;
            case 4:
                System.out.print("\nBookId: ");
                id = sc.nextInt();
                success = LibraryManagementSystem.searchbook(id);
                break;
            case 5:
                System.out.print("\nBookId: ");
                id = sc.nextInt();
                success = LibraryManagementSystem.issuebook(id);
                break;
            case 6:
                System.out.println("\nClosing Application...");
                System.exit(0);
                break;
            default:
                System.out.println("\n\t\tInvalid input");
        }

        if(success == PASS) {
            System.out.println("Successful");
        } else if(success == FAIL) {
            System.out.println("Unsuccessful");
        } else {
            System.out.println("Error");
        }

        sc.close();
    }
}
