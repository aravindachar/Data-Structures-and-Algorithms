/**
 * Main class to test the functionality of the Circular Linked List (CLL).
 */
public class Main {

    public static void main(String[] args) {
        // Create a new instance of our Circular Linked List.
        CLL list = new CLL();

        System.out.println("--- Adding elements to the front ---");
        list.addfirst(30);
        list.addfirst(20);
        list.addfirst(10);
        list.display(); // Expected: 10 -> 20 -> 30 -> HEAD (size: 3)

        System.out.println("\n--- Adding elements to the end ---");
        list.addlast(40);
        list.addlast(50);
        list.display(); // Expected: 10 -> 20 -> 30 -> 40 -> 50 -> HEAD (size: 5)

        System.out.println("\n--- Deleting the first element ---");
        list.deletefirst(); // Deletes 10
        list.display(); // Expected: 20 -> 30 -> 40 -> 50 -> HEAD (size: 4)

        System.out.println("\n--- Deleting the last element ---");
        list.deleteLast(); // Deletes 50
        list.display(); // Expected: 20 -> 30 -> 40 -> HEAD (size: 3)

        System.out.println("\n--- Testing Edge Cases: Deleting all elements ---");
        list.deletefirst(); // Deletes 20
        list.deleteLast();  // Deletes 40
        list.deletefirst(); // Deletes 30 (now list is empty)
        list.display();     // Expected: List is empty.

        System.out.println("\n--- Trying to delete from an empty list ---");
        list.deletefirst(); // Expected: List is empty. Nothing to delete.
        
        System.out.println("\n--- Re-populating the list ---");
        list.addlast(100);
        list.display(); // Expected: 100 -> HEAD (size: 1)
        list.deleteLast();
        list.display(); // Expected: List is empty.
    }
}

git remote add origin~