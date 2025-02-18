import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        System.out.print("enter the nubmer of lines :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i ++){
            // star
            for(int j = 0 ; j <= n-i-1;j++){
                System.out.print("*");
            }
            // space
            for(int k = 0 ; k <= 2*i+1;k++){
                System.out.print(" ");
            }
            // star
            for(int j = 0 ; j <= n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
