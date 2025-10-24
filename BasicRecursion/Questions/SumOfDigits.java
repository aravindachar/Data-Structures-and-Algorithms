import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = sumofdigits(number);
        int product = product(number);
        System.out.println("the sum of digits:"+sum);
        System.out.println("the prodcut of digits:"+product);
    }
    static int product(int n){
        if(n%10 == n){
            return n ;
        }
        return n%10 * product(n/10);
    }
    static int sumofdigits(int n ){
        if(n == 0 ){
            return 0 ;
        }
        return n%10 + sumofdigits(n/10);
    }
}
