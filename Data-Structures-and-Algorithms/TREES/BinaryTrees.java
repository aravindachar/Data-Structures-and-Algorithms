// The 'package' keyword organizes your classes into a folder-like structure.
package TREES;

// The 'import' statement brings in code written by others that we can use.
// java.util.Scanner is used to get input from the user (like typing on the keyboard).
import java.util.Scanner;
// We need the Queue interface and LinkedList class for the Level-Order Traversal.
import java.util.Queue;
import java.util.LinkedList;

/**
 * ===================================================================
 * A class representing a Binary Tree data structure.
 * This class acts as a "manager" or "controller". It holds the reference
 * to the root of the tree and provides methods to populate and display it.
 * ===================================================================
 */
public class BinaryTrees {

    // 'root' is the only instance variable of this class. It stores the topmost node of the tree.
    // It is the single entry point to access every other node in the tree.
    // WHY PRIVATE? To protect the tree's integrity (Encapsulation). No outside class
    // can accidentally delete or corrupt the entire tree by changing this root.
    private Node root;

    /**
     * ===================================================================
     * A private nested class representing a single Node in the tree.
     * WHY PRIVATE? Because the concept of a 'Node' is an internal detail of how our
     * BinaryTree works. No other class outside of BinaryTrees needs to know about it.
     * WHY STATIC? So that this Node class is not tied to a specific instance of BinaryTrees.
     * It's a self-contained blueprint for a node.
     * ===================================================================
     */
    private static class Node {
        int value;      // The data stored in the node
        Node left;      // A reference to the left child node
        Node right;     // A reference to the right child node

        // Constructor for the Node class. It's called when we create a new node.
        public Node(int value) {
            this.value = value;
            // When a node is first created, it has no children, so we leave
            // its 'left' and 'right' references as null.
        }
    }

    /**
     * ===================================================================
     * PUBLIC METHOD: populate
     * This is the "user-friendly" method to start building the tree.
     * It hides the complexity of recursion from the user.
     * The user just calls this one method to kick off the entire process.
     * ===================================================================
     */
    public void populate(Scanner sc) {
        System.out.println("Enter the root Node's value:");
        int value = sc.nextInt();
        // Create the root node with the user's value
        this.root = new Node(value);
        // Now, call the private recursive helper method to build the rest of the tree
        populate(sc, this.root);
    }

    /**
     * ===================================================================
     * PRIVATE METHOD: populate (Recursive Helper)
     * This is the "engine room" where the real work of building the tree happens.
     * It uses recursion to build the tree branch by branch.
     * WHY PRIVATE? It's a complex internal process. We hide it to provide a simple
     * public interface and to be able to change this logic later without breaking user code.
     * ===================================================================
     */
    private void populate(Scanner sc, Node node) {
        // --- Handle the Left Child ---
        System.out.println("Do you want to enter a left child for " + node.value + "? (true/false)");
        boolean hasLeft = sc.nextBoolean();
        if (hasLeft) {
            System.out.println("Enter the value for the left child of " + node.value + ":");
            int value = sc.nextInt();
            // 1. Create the new node
            Node newLeftNode = new Node(value);
            // 2. Link it to the current node's 'left' reference
            node.left = newLeftNode;
            // 3. THE RECURSIVE CALL: Repeat this entire process for the new left child.
            populate(sc, node.left);
        }

        // --- Handle the Right Child ---
        System.out.println("Do you want to enter a right child for " + node.value + "? (true/false)");
        boolean hasRight = sc.nextBoolean();
        if (hasRight) {
            System.out.println("Enter the value for the right child of " + node.value + ":");
            int value = sc.nextInt();
            // 1. Create the new node
            Node newRightNode = new Node(value);
            // 2. Link it to the current node's 'right' reference
            node.right = newRightNode;
            // 3. THE RECURSIVE CALL: Repeat this entire process for the new right child.
            populate(sc, node.right);
        }
    }

    /**
     * ===================================================================
     * PUBLIC METHOD: display
     * A simple, user-friendly method to print a visual representation of the tree.
     * It calls the private recursive helper to do the actual work.
     * ===================================================================
     */
    public void display() {
        System.out.println("\n--- Tree Structure ---");
        // Start the recursive display process from the root with no initial indentation.
        display(this.root, "@@@");
        System.out.println("----------------------");
    }

    /**
     * ===================================================================
     * PRIVATE METHOD: display (Recursive Helper)
     * This method prints the tree in a structured way using pre-order traversal.
     * WHY PRIVATE? The user shouldn't have to worry about providing the root node
     * or the initial indentation. This is a hidden implementation detail.
     * ===================================================================
     */
    private void display(Node node, String indent) {
        // BASE CASE: This is the most important part of recursion.
        // If the node is null, it means we've reached the end of a branch. We stop and return.
        if (node == null) {
            return;
        }

        // RECURSIVE STEP:
        // 1. Print the current node's value with its indentation
        System.out.println(indent + "└── " + node.value);

        // 2. Recursively call for the children, adding more indentation for the next level
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

}