package Recurrsion.Arrays;

public class LiinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(LinearS(arr, 44 , 0));
    }   
    static boolean LinearS(int[] arr , int target ,int index ){
        if(index == arr.length -1 ){
            return false ;

        }
         return arr[index] == target  ||  LinearS(arr , target , index+1);
    }
}
