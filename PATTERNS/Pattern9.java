//    0   
//   012  
//  01234 
// 0123456

import java.util.*;
public class Pattern9 {
    public static void main(String args[]){
        System.out.println("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i <n ; i++){
            // space
            for(int j = 0 ; j <n-i-1;j++){
                System.out.print(" ");
            } 
            // star
            for(int k = 0 ; k < 2*i+1;k++){
                System.out.print(k);
            }
            // space
            for(int j = 0 ; j <n-i-1;j++){
                System.out.print(" ");
            } 
            System.out.println();
        }
}
}