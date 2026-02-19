package Recursion.Arrays;

public class Q1ChechSroted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5};
        System.out.println(Sorted(arr , 0));
    }
    static boolean Sorted(int[] arr , int index){
        if(index == arr.length-1 ){
            return false ;
        }
        // Chech the consiqutive pairs till it reaches to the end 
        return arr[index]<arr[index + 1 ] && Sorted(arr, index+1);
    }
}
