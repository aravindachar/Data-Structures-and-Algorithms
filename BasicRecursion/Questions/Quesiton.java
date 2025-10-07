import java.util.Scanner;

public class Quesiton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        // Nto1(number);
        // System.out.println("One to Number");
        // OnetoN(number);
        // System.out.println("Number to One");

        System.out.println();
        int ans = Factorial(number);
        System.out.println(ans);
    }
    public static void Nto1(int n){
        if(n==0){
            return  ;
        }
        System.out.print(n+"-->");
        Nto1(n-1);

    }
    public static void OnetoN(int n){
        if(n==0){
            return  ;
        }
        OnetoN(n-1);
        System.out.print(n+"-->");
    }

        public static int Factorial(int n){
        if(n<=1){
            return 1  ;
        }
        return n*Factorial(n-1) ;

    }

}
