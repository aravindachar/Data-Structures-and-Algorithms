# Arrays in Java 

This directory contains fundamental concepts and common algorithms related to **Arrays** and **ArrayLists** in Java. An array is a data structure that stores a collection of elements of the same data type in contiguous memory locations.

### Key Characteristics of Arrays
* **Fixed-Size**: Once created, the size of an array cannot be changed.
* **Indexed Access**: Elements are accessed via a zero-based index, allowing for constant-time ($O(1)$) access.
* **Homogeneous**: All elements must be of the same data type.

---

## ## Concepts Covered

This folder provides code examples for the following core concepts:

* **Declaration and Initialization**: How to create and initialize 1D and 2D arrays.
* **Traversal and Manipulation**: Looping through arrays, accessing, and modifying elements.
* **Mutability**: How arrays behave when passed as parameters to functions (pass-by-reference value).
* **Common Algorithms**: Finding the maximum value, swapping elements, and reversing an array.
* **2D Arrays (Matrices)**: Working with grid-like data structures.
* **ArrayList**: Introduction to Java's dynamic, resizable array implementation.

---

## ## Files in This Directory

* **`ArrayIntroduction.java`**: Covers the basic syntax for creating arrays and explains why they are necessary.
* **`FindMaxInArray.java`**: Implements algorithms to find the largest element in an array and within a specific range.
* **`ArrayReversal.java`**: Demonstrates how to swap two elements and uses this to reverse an array using the two-pointer technique.
* **`ArrayAsParameter.java`**: Explains the crucial concept that arrays are mutable when passed to functions.
* **`MultiDimArray.java`**: Shows how to work with 2D arrays (matrices), including input and output.
* **`ArrayListExample.java`**: Demonstrates the creation and common methods of Java's `ArrayList`.

---

## ## How to Run

You can compile and run any of the Java files from your terminal.

```bash
# Compile the Java file
javac FileName.java

# Run the compiled code
java FileName