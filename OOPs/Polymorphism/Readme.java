// A Comprehensive Examination of Polymorphism in Java
// Polymorphism, a term derived from the Greek for "many forms," denotes the capacity of a single interface, method, or object to manifest in multiple forms. It is a foundational pillar of Object-Oriented Programming, facilitating the development of flexible, extensible, and maintainable applications.

// This document provides a systematic examination of the concept, elucidating the relationships between its constituent mechanisms, such as binding and dispatch, and clarifying common distinctions.


// Part 1: The Dichotomy of Polymorphism
// In the Java programming language, polymorphism is categorized into two distinct types, which are distinguished by the point at which the linkage between a method call and its implementation occurs.

// A. Compile-Time Polymorphism (Static Binding)
// This form of polymorphism is resolved by the compiler prior to program execution, a process also known as Early Binding.

// Mechanism: Method Overloading
// Method overloading is implemented by defining multiple methods within the same class that share the same name but possess different parameter lists. These differences may include the quantity, type, or sequence of arguments. The compiler determines the precise method to invoke by analyzing the arguments provided in the method call.

// public class Printer {
//     // Overloaded methods
//     public void print(String s) {
//         System.out.println("Printing a String: " + s);
//     }
//     public void print(int i) {
//         System.out.println("Printing an Integer: " + i);
//     }
// }
// // The compiler binds the call print("Hello") to the first method at compile time.

// B. Runtime Polymorphism (Dynamic Binding)
// A more dynamic form of polymorphism, this type is resolved by the Java Virtual Machine (JVM) during program execution, a process referred to as Late Binding.

// Mechanism: Method Overriding
// Method overriding is implemented when a subclass "provides a specific implementation for a method that is already defined in its superclass". This mechanism necessitates an inheritance relationship (an "is-a" relationship) between the classes.

// class Animal {
//     public void makeSound() {
//         System.out.println("Generic animal sound");
//     }
// }

// class Dog extends Animal {
//     @Override // This method overrides the parent's
//     public void makeSound() {
//         System.out.println("Dog barks");
//     }
// }

// Part 2: The Mechanism of Runtime Polymorphism
// An understanding of Dynamic Method Dispatch and Late Binding is essential to comprehending the internal mechanics of Runtime Polymorphism.
// ------------------------------------------------------------------------------
// Dynamic Method Dispatch
// This is the process through which the JVM implements late binding. When an overridden method is invoked via a superclass reference, the JVM inspects the actual class of the object at runtime and dispatches the call to the corresponding implementation of the method.

// Essentially, Late Binding describes when the resolution occurs (at runtime), while Dynamic Method Dispatch describes how that resolution is executed.

// public class Main {
//     public static void main(String[] args) {
//         // 1. The reference variable is declared with the superclass type.
//         Animal myAnimal;

//         // 2. The reference is assigned an object of the subclass type.
//         myAnimal = new Dog();

//         // 3. DYNAMIC METHOD DISPATCH IN ACTION:
//         // The method call is made on an Animal reference.
//         // At runtime, the JVM identifies the object's class as Dog.
//         // Consequently, it dispatches the call to the makeSound() method within the Dog class.
//         myAnimal.makeSound(); // Output: Dog barks
//     }
// }

// Part 3: Advanced Concepts and Distinctions
// This section addresses frequently misunderstood concepts concerning static members and instance variables in the context of polymorphism.

// Distinction 1: Overriding Static Methods (Method Hiding)
// It is not possible to override static methods. Static members are associated with the class rather than a specific object instance and are resolved at compile-time (Early Binding).

// When a static method is defined in a subclass with a signature identical to that of a static method in its superclass, the subclass's method is said to hide the superclass's method. " The version of the method that is invoked is determined by the type of the reference variable, not the class of the object." 

// Example Illustrating the Difference:

// class Parent {
//     // Static method
//     static void greet() { System.out.println("Hello from Parent"); }
//     // Instance method
//     void introduce() { System.out.println("I am a Parent"); }
// }

// class Child extends Parent {
//     // This HIDES the parent's static method
//     static void greet() { System.out.println("Hello from Child"); }
//     // This OVERRIDES the parent's instance method
//     @Override
//     void introduce() { System.out.println("I am a Child"); }
// }

// public class Test {
//     public static void main(String[] args) {
//         Parent p = new Child();

//         // METHOD HIDING: Resolved by reference type (Parent) at compile-time.
//         p.greet();      // Output: Hello from Parent

//         // METHOD OVERRIDING: Resolved by object type (Child) at runtime.
//         p.introduce();  // Output: I am a Child
//     }
// }

// Distinction 2: Polymorphism and Instance Variables (Variable Hiding)
// The principles of overriding and overloading are applicable exclusively to methods, which define behavior. These concepts do not extend to instance variables, which define state.

// Analogous to static methods, if a subclass defines an instance variable with the same name as an instance variable in its superclass, it hides the superclass's variable. Access to the variable is resolved at compile-time based on the type of the reference.

// class Parent {
//     String name = "Parent";
// }
// class Child extends Parent {
//     String name = "Child"; // Hides the parent's 'name' variable
// }

// public class Test {
//     public static void main(String[] args) {
//         Parent p = new Child();
//         // Resolved by reference type (Parent) at compile-time.
//         System.out.println(p.name); // Output: Parent
//     }
// }

// Summary: A Comprehensive Overview
// Concept

// Definition

// Binding Type

// Resolution Authority

// Applicable To

// Method Overloading

// Same method name, different parameters

// Early (Static)

// Compiler

// Methods

// Method Overriding

// Subclass provides a new implementation

// Late (Dynamic)

// JVM (at Runtime)

// Instance Methods

// Method Hiding

// Subclass re-defines a static method

// Early (Static)

// Compiler

// Static Methods

// Variable Hiding

// Subclass re-defines a variable

// Early (Static)

// Compiler

// Instance/Static Variables

// A thorough understanding of these distinctions is crucial for leveraging polymorphism to develop software that is not only functional but also robust, scalable, and maintainable.