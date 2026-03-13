package Recursion;

public class Q1Fiboachi {
    public static void main(String[] args) {
        System.out.println(Fibo(4));
    }
    static int Fibo(int n){
        // base conditon 
        if(n<2){
            return 1 ;
        }
        // return statenent 
        return Fibo(n-1)+ Fibo(n-2);
    }
}
