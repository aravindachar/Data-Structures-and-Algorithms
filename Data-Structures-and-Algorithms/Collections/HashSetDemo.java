package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> languages = new HashSet<>();

        // Add elements
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");

        // Try to add a duplicate - it will be ignored
        boolean addedAgain = languages.add("Java");
        System.out.println("Was 'Java' added again? " + addedAgain); // false
        System.out.println("Set: " + languages); // Output: [Java, JavaScript, Python] (order not guaranteed)

        // Check if an element exists (very fast)
        if (languages.contains("Python")) {
            System.out.println("Found Python!");
        }

        // Remove an element
        languages.remove("JavaScript");
        System.out.println("Set after removing JavaScript: " + languages);
    }
}

