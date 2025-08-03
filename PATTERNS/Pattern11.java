// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1
import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        System.out.print("enter the number of elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int start = 1 ;
            if(i%2==0){
                start = 1 ;
            }
            else{
                start = 0 ;
            }
            for(int j = 0 ; j<=i;j++){
                System.out.print(start+" ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
