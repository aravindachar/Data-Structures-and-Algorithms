package abstractdemo;

public class Son extends Parent {
    
    // This constructor is correct! It properly calls the parent's constructor.
    Son(int age) {
        super(age);
    }

    @Override
    public void career() {
        System.out.println("I want to become a pilot");
    }

    @Override
    void partner() {
        System.out.println("Her name is Preethi");
    }
}