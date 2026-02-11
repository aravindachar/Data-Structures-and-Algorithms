import java.util.Scanner;

public class Stringsinputs {

    
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5};
        int s = 0 ; int e = nums.length-1 ;
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp ;
            s++;
            e--;

        }
        for(int i = 0 ; i < nums.length ; i++){
            System.out.println(nums[i]);
        }

    }
}
