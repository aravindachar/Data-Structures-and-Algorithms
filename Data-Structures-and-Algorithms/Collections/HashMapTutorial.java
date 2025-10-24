package Collections;

import java.util.HashMap;
import java.util.Map; // Good practice to code to the Map interface

public class HashMapTutorial {

    public static void main(String[] args) {

        // ======================================================
        // 1. Creating a HashMap
        // ======================================================
        
        // We declare a Map. The keys will be Strings (e.g., names)
        // and the values will be Integers (e.g., scores).
        Map<String, Integer> studentScores = new HashMap<>();

        
        // ======================================================
        // 2. Adding and Updating Data (.put())
        // ======================================================
        
        // Use .put(key, value) to add entries
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 80);
        studentScores.put("Charlie", 98);
        
        System.out.println("Initial map: " + studentScores);
        
        // If you .put() a key that already exists, it UPDATES the value.
        // .put() returns the OLD value (or null if it was new).
        Integer oldBobScore = studentScores.put("Bob", 82);
        
        System.out.println("Bob's old score: " + oldBobScore); // Prints 80
        System.out.println("Updated map: " + studentScores);
        
        // .putIfAbsent() only adds the pair if the key is not already present.
        studentScores.putIfAbsent("Alice", 100); // Does nothing, Alice exists
        studentScores.putIfAbsent("David", 88);  // Adds David
        System.out.println("After putIfAbsent: " + studentScores);


        // ======================================================
        // 3. Retrieving Data (.get())
        // ======================================================
        
        // Use .get(key) to retrieve a value
        Integer aliceScore = studentScores.get("Alice");
        System.out.println("Alice's score: " + aliceScore); // Prints 95
        
        // If you .get() a key that doesn't exist, it returns null
        Integer frankScore = studentScores.get("Frank");
        System.out.println("Frank's score: " + frankScore); // Prints null
        
        // To avoid 'null', you can use .getOrDefault()
        // It returns the value if found, or a default value if not.
        Integer eveScore = studentScores.getOrDefault("Eve", 0);
        System.out.println("Eve's score: " + eveScore); // Prints 0 (the default)

        
        // ======================================================
        // 4. Checking for Keys and Values
        // ======================================================

        // .containsKey() is very fast (O(1) average)
        boolean hasCharlie = studentScores.containsKey("Charlie");
        System.out.println("Contains Charlie? " + hasCharlie); // Prints true

        // .containsValue() is SLOW (O(n)) because it has to check every value.
        boolean hasPerfectScore = studentScores.containsValue(100);
        System.out.println("Did anyone get 100? " + hasPerfectScore); // Prints false

        
        // ======================================================
        // 5. Removing Data (.remove())
        // ======================================================
        
        // .remove(key) removes the entry and returns the value (or null)
        Integer removedScore = studentScores.remove("Bob");
        System.out.println("Removed Bob's score: " + removedScore); // Prints 82
        System.out.println("Map after removing Bob: " + studentScores);
        
        
        // ======================================================
        // 6. Other Useful Methods
        // ======================================================
        
        // .size() returns the number of key-value pairs
        int count = studentScores.size();
        System.out.println("Total students: " + count);

        // .isEmpty() checks if the map has any entries
        boolean empty = studentScores.isEmpty();
        System.out.println("Is map empty? " + empty);
        
        // .clear() removes all entries from the map
        studentScores.clear();
        System.out.println("Map after clearing: " + studentScores);
        System.out.println("Is map empty now? " + studentScores.isEmpty());


        // ======================================================
        // 7. Iterating over a HashMap (VERY IMPORTANT)
        // ======================================================
        
        // Let's re-populate the map
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("UK", "London");
        capitals.put("Japan", "Tokyo");
        
        // --------
        // OPTION 1: Iterating over Keys (.keySet())
        // --------
        System.out.println("\n--- Iterating over Keys ---");
        for (String country : capitals.keySet()) {
            String capital = capitals.get(country); // Requires a second lookup
            System.out.println("Country: " + country + ", Capital: " + capital);
        }

        // --------
        // OPTION 2: Iterating over Values (.values())
        // --------
        // Use this if you only care about the values, not the keys.
        System.out.println("\n--- Iterating over Values ---");
        for (String capital : capitals.values()) {
            System.out.println("Capital: " + capital);
        }
        
        // --------
        // OPTION 3: Iterating over Entries (.entrySet()) - *** BEST WAY ***
        // --------
        // This is the most efficient method. It gives you the key and value
        // together in one object (Map.Entry) without a second lookup.
        System.out.println("\n--- Iterating over Entries (Best Practice) ---");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.println("Country: " + country + ", Capital: " + capital);
        }
    }
}