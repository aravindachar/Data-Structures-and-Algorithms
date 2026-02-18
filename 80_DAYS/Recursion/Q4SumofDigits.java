package Recursion;

public class Q4SumofDigits {
 public static void main(String[] args) {
    int ans = sumofdigit(12340);
    System.out.println(ans);
 }   
 static int sumofdigit(int n ){
    if(n <= 0){
        return 0 ;
    }
    return n%10 + sumofdigit(n/10);
 }
}
