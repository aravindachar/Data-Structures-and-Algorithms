// * * * * 
// * * * 
// * * 
// * 
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number on lines:");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n;i++){
            for(int j= 0 ; j< n-i+1 ;j++){
                System.out.print("* "+i);
            }
            System.out.println();
        }
    }
}
