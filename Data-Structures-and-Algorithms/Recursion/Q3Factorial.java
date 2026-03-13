package Recursion;

public class Q3Factorial {
    public static void main(String[] args) {
        int ans = facto(21)     ;   
        System.out.println(ans);
    }
    static int facto(int n){
        if(n <= 1){
            return 1 ;
        }
        return  n*facto(n-1); 
        
    }
}
