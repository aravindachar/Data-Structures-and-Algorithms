import java.util.ArrayList; // You must import ArrayList from java.util

/**444444444444
 * ===================================================================================
 * DSA REPOSITORY: ArrayList in Java
 * ===================================================================================
 *
 * An ArrayList is a resizable array, part of Java's Collection Framework.
 * Unlike standard arrays, which have a fixed size, an ArrayList can grow and
 * shrink dynamically as you add or remove elements.
 *
 * KEY DIFFERENCES FROM A STANDARD ARRAY:
 * 1.  **Dynamic Size:** You don't need to specify a size at creation, and it changes automatically.
 * 2.  **Objects Only:** It can only store objects, not primitive types (e.g., it stores `Integer`, not `int`).
 * 3.  **Methods:** It uses methods like `.add()`, `.get()`, `.size()` for operations, unlike the `[]` syntax and `.length` property of arrays.
 *
 * This file demonstrates the most common operations.
 */
public class ArrayListExample {

    public static void main(String[] args) {

        // 1. Initialization
        // Create an ArrayList to store String objects.
        ArrayList<String> groceryList = new ArrayList<>();


        // 2. Adding Elements
        // The .add() method appends elements to the end of the list.
        System.out.println("--- Adding elements ---");
        groceryList.add("Apples");
        groceryList.add("Milk");
        groceryList.add("Bread");
        System.out.println("Current list: " + groceryList); // ArrayList has a nice default toString() method


        // 3. Accessing and Modifying Elements
        // Use .get(index) to access and .set(index, value) to modify.
        System.out.println("\n--- Accessing and Modifying ---");
        String secondItem = groceryList.get(1); // Get the item at index 1
        System.out.println("Item at index 1: " + secondItem);

        groceryList.set(0, "Organic Apples"); // Change the item at index 0
        System.out.println("List after modification: " + groceryList);


        // 4. Removing Elements
        // Use .remove(index) to delete an element.
        System.out.println("\n--- Removing an element ---");
        groceryList.remove(2); // Removes "Bread" from the list
        System.out.println("List after removing item at index 2: " + groceryList);


        // 5. Getting the Size
        // Use the .size() method to get the number of elements in the list.
        System.out.println("\n--- Getting the size ---");
        System.out.println("The size of the grocery list is: " + groceryList.size());


        // 6. Checking for an Element
        // Use .contains() to see if an item exists in the list.
        System.out.println("\n--- Checking for an element ---");
        boolean hasMilk = groceryList.contains("Milk");
        System.out.println("Does the list contain 'Milk'? " + hasMilk);


        // 7. Traversing the List
        // You can loop through an ArrayList just like an array.
        System.out.println("\n--- Traversing the list ---");
        // Using an enhanced for-each loop (most common and cleanest)
        for (String item : groceryList) {
            System.out.println("Item: " + item);
        }
    }
}