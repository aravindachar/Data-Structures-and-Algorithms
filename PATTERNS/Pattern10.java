//     $    
//    $$$   
//   $$$$$  
//  $$$$$$$ 
// $$$$$$$$$
// $$$$$$$$$ 
//  $$$$$$$  
//   $$$$$   
//    $$$    
//     $     
import java.util.*;
public class Pattern10 {
    public static void main(String args[]){
        System.out.println("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = l/2;

        for(int i = 0 ; i <n ; i++){
            // space
            for(int j = 0 ; j <n-i-1;j++){
                System.out.print(" ");
            } 
            // star
            for(int k = 0 ; k < 2*i+1;k++){
                System.out.print("$");
            }
            // space
            for(int j = 0 ; j <n-i-1;j++){
                System.out.print(" ");
            } 
            System.out.println();
        }

        for(int i = 0 ; i <n ; i++){
            // space
            for(int j = 0 ; j <i;j++){
                System.out.print(" ");
            } 
            // star
            for(int k = 0 ; k < 2*n-(2*i+1);k++){
                System.out.print("$");
            }
            // space
            for(int j = 0 ; j <i;j++){
                System.out.print(" ");
            } 
            System.out.println(" ");
        
    }
}
}