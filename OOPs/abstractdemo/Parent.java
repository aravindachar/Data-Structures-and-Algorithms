package abstractdemo;

public abstract class Parent {
    int age = 0;

    // This is the ONLY constructor available in the Parent class.
    // Any subclass MUST call this constructor using super(ageValue).
    public Parent(int age) {
        this.age = age;
    }

    public void age(int age) {
        this.age = age;
    }

    // Static methods belong to the class, not an instance.
    static void hello() {
        System.out.println("hello this is a static method in the abstract Parent class");
    }

    // Abstract methods: A contract that concrete subclasses MUST implement.
    abstract void career();
    abstract void partner();
}