// 0123456
// 012345
// 01234
// 0123
// 012
// 01
// 0
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number on lines:");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n;i++){
            for(int j= 0 ; j< n-i+1 ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
