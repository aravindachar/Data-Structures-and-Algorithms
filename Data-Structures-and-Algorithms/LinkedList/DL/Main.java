package DL;
import java.security.cert.LDAPCertStoreParameters;

public class Main {
     public static void main(String[] args) {
        DLL list = new DLL(); // Create a new Doubly Linked List.

        // Test insertFirst
        System.out.println("Inserting elements at the beginning:");
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.display();

        // Test insertLast
        System.out.println("\nInserting elements at the end:");
        list.insertLast(99);
        list.insertLast(55);
        list.display();

        // Test insert at a specific index
        System.out.println("\nInserting 100 at index 2:");
        list.insert(100, 2); // Insert 100 at index 2 (0-indexed)
        list.display();

        System.out.println("\nInserting 200 at index 0:");
        list.insert(200, 0); // Insert 200 at index 0
        list.display();

        System.out.println("\nInserting 300 at the end (index 'size'):");
        list.insert(300, list.getSize()); // Insert 300 at the end
        list.display();


        // Test deleteFirst
        System.out.println("\nDeleted first element: " + list.deleteFirst());
        list.display();

        // Test deleteLast
        System.out.println("\nDeleted last element: " + list.deleteLast());
        list.display();

        // Test delete at a specific index
        System.out.println("\nDeleted element at index 2: " + list.delete(2));
        list.display();

        // Test getSize
        System.out.println("\nSize of the list: " + list.getSize());

        // // Test find
        // System.out.println("\nFinding 8: " + (list.find(8) != null ? list.find(8).value : "Not Found"));
        // System.out.println("Finding 200: " + (list.find(200) != null ? list.find(200).value : "Not Found"));

        System.out.println("\nTesting invalid insertion index:");
        list.insert(500, -1);
        list.insert(500, list.getSize() + 1);
        list.display(); // Should remain unchanged
    }
}
