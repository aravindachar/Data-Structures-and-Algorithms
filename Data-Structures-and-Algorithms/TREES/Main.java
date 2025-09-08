package TREES;

import java.util.Scanner;

public class Main {


    //  * ===================================================================
    //  * The main method is the entry point for running a Java program.
    //  * We use it here to test our BinaryTrees class.
    //  * ===================================================================
    //  *
    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Create an instance (an object) of our BinaryTrees class.
        BinaryTrees tree = new BinaryTrees();

        // Call the public method to build the tree using the scanner.
        tree.populate(scanner);

        // Call the public method to display the tree that was just built.
        tree.display();

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}