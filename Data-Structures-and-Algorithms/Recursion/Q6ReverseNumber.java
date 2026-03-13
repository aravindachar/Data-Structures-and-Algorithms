package Recursion;

public class Q6ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber(1234);

        System.out.println(rev2(123));
    }
    public static int sum = 0 ;
    static void ReverseNumber(int n){
        if(n ==0){
            return ;
        }
        int rem = n%10 ;
        sum = sum *10 + rem;
        ReverseNumber(n/10);
    }


    public static int rev2(int n){
        int digit = (int)(Math.log10(n)) +1 ;
        return helper(n , digit);

    }
    private static int helper(int n , int digit){
        if(n==0){
            return 0;
        }
        int rem = n % 10 ;
        return rem*(int)(Math.pow(10, digit-1 )) + helper(n/10, digit-1);
    }
}
 