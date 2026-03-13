package Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        Number(1);
    }
    static void Number(int n ){
        if(n > 10 ) return ;
        System.out.println(n);
        Number(n+1);

    }
}
