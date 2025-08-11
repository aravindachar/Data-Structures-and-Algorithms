//      *      
//     ***     
//    *****    
//   *******   
//  *********  
// tip :apply loops for the space and star separately  
// first print the space then star then space 
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of lines :");
        int n = sc.nextInt();

        for(int i = 0 ; i <= n;i++){
            // space
            for(int j = 0 ; j<=n-i-1;j++){
                System.out.print(" ");
            }
            // start
            for(int k = 0 ; k<2*i+1;k++){
                System.out.print("*");
            }
            // space
            for(int j = 0 ; j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
