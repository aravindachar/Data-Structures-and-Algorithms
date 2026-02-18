package Recursion;

public class Message {
    public static void main(String[] args) {
        Message1();
    }
    static void Message1(){
        System.out.println("hello 1 ");
        Message2();
    }
    static void Message2(){
        System.out.println("hello 2");
        Message3();
    }
    static void Message3(){
        System.out.println("hello 3");
    }
}
