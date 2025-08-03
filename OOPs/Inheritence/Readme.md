Understanding Inheritance in OOP
Inheritance is one of the four foundational pillars of Object-Oriented Programming (OOP). It is the mechanism by which one class acquires the properties (fields) and behaviors (methods) of another class. Inheritance represents an "is-a" relationship between classes and is a powerful tool for code reuse and creating logical hierarchies.

The Core Concept: The "is-a" Relationship
At its heart, inheritance models real-world hierarchies.

A Car is-a Vehicle.

A Dog is-a Animal.

A Manager is-a Employee.

In each case, the child (e.g., Car) is a more specific version of the parent (e.g., Vehicle). It inherits all the general traits of the parent and adds its own unique features.

Key Terminology
Parent Class (Superclass/Base Class): The class whose properties and methods are inherited by another class.

Child Class (Subclass/Derived Class): The class that inherits from another class. It extends the functionality of the parent.

Why Use Inheritance?
Code Reusability: This is the primary benefit. You can write common logic once in a parent class and reuse it across multiple child classes without duplication. This makes code easier to maintain—fix a bug in the parent, and it's fixed for all children.

Logical Structure: It helps organize code into a clear and logical structure that mirrors real-world relationships, making the software design easier to understand.

Polymorphism: Inheritance is a prerequisite for powerful runtime polymorphism (method overriding), where a child class can provide a specific implementation of a method from its parent class.

How Inheritance Works: A Practical Guide
Let's explore how to implement inheritance using a practical example: a Box and a more specific BoxWeight.

The extends Keyword
To create a child class, you use the extends keyword in the class declaration.

// Parent Class (Superclass)
public class Box {
    double length;
    double width;
    double height;

    // Constructor for the Box class
    Box(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public void displayInfo() {
        System.out.println("Dimensions: " + length + "x" + width + "x" + height);
    }
}

// Child Class (Subclass) inherits from Box
public class BoxWeight extends Box {
    // BoxWeight has all the properties of Box (l, w, h)
    // plus its own specific property.
    double weight;

    // ... constructor will be defined next
}

The super() Keyword: Calling the Parent Constructor
A child class constructor must call the constructor of its parent class to initialize the inherited fields. This is done using the super() keyword.

Rule: The call to super() must be the very first statement in the child class's constructor.

public class BoxWeight extends Box {
    double weight;

    // Constructor for the child class
    public BoxWeight(double l, double w, double h, double weight) {
        // 1. Call the parent constructor to initialize the inherited fields
        super(l, w, h);

        // 2. Initialize the field specific to this child class
        this.weight = weight;
    }
}

Accessing Members
An object of a child class has access to its own members and the public/protected members of its parent class.

public class Main {
    public static void main(String[] args) {
        BoxWeight myBox = new BoxWeight(10, 20, 15, 50.5);

        // Accessing the 'height' field inherited from Box
        System.out.println("The height is: " + myBox.height);

        // Accessing the 'weight' field defined in BoxWeight
        System.out.println("The weight is: " + myBox.weight);

        // Calling the 'displayInfo' method inherited from Box
        myBox.displayInfo();
    }
}

Method Overriding: Specializing Behavior
A child class can provide its own specific implementation of a method that is already defined in its parent class. This is called method overriding.

public class BoxWeight extends Box {
    double weight;

    // ... constructor ...

    // Overriding the displayInfo method from the Box class
    @Override // This annotation is good practice
    public void displayInfo() {
        // First, call the parent's method to display the dimensions
        super.displayInfo();
        
        // Then, add the new behavior for this class
        System.out.println("The weight is: " + this.weight);
    }
}

// Now when you call myBox.displayInfo(), the new, overridden version runs!

Types of Inheritance
Different languages support different types of inheritance:

Single Inheritance: A class can only inherit from one parent class. (Supported by Java, C#).

Multilevel Inheritance: A class inherits from a child class, forming a chain (e.g., C extends B, and B extends A).

Hierarchical Inheritance: One parent class has multiple child classes (e.g., Car and Truck both extend Vehicle).

Multiple Inheritance: A class inherits from multiple parent classes. (Supported by C++, but can lead to the "Diamond Problem." Java uses interfaces to achieve a similar result safely).

By understanding and correctly applying inheritance, you can build software that is not only powerful and efficient but also elegant and easy to maintain.