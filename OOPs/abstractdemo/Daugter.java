package abstractdemo;

public class Daugter extends Parent { // The class name is 'Daugter', likely a typo for 'Daughter'
    
    // !! CORRECTION !!
    // You MUST add a constructor here.
    // Because the Parent class does not have a default Parent() constructor,
    // you must explicitly call the Parent(int age) constructor.
    public Daugter(int age) {
        super(age); // This line calls the constructor of the Parent class.
    }

    @Override // It's good practice to use the @Override annotation.
    void career() {
        System.out.println("I want to become a dancer");
    }

    @Override
    void partner() {
        System.out.println("I love Jonny LLB");
    }
}