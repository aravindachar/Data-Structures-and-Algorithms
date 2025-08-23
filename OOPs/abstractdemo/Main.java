package abstractdemo;

public class Main {
    public static void main(String[] args) {
        // We must now provide an age when creating a Daughter,
        // because its constructor requires an int.
        Daugter daughter = new Daugter(22);
        daughter.career();  
        System.out.println("Daughter's age: " + daughter.age);

        System.out.println("--------------------");

        // !! CORRECTION !!
        // Same for Son, we must provide an age to match its constructor.
        // This is a great example of polymorphism: Reference type is Parent,
        // but the object is a Son.
        Parent son = new Son(25);
        son.partner();
        son.career();
        System.out.println("Son's age: " + son.age);

        System.out.println("--------------------");

        // Correctly calling a static method using the class name.
        // You don't need an object instance for this.
        Parent.hello();
    }
}