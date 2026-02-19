package Recursion.Arrays;

import java.util.ArrayList;

public class Q3FindAllindex {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,4,5,6,7};

        // Using global list method
        FindAllIndex(arr, 4, 0);
        System.out.println(list);

        // Using return-type recursion method
        ArrayList<Integer> ans = FindAllIndex2(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }

    // GLOBAL LIST APPROACH
    static ArrayList<Integer> list = new ArrayList<>();

    static void FindAllIndex(int[] arr , int target , int index){

        // Stop when index crosses array length
        if(index == arr.length){
            return;
        }

        // Add index if target found
        if(arr[index]== target){
            list.add(index);
        }

        // Recursive call
        FindAllIndex(arr, target, index+1);
    }

    // RETURN LIST APPROACH (better)
    static ArrayList<Integer> FindAllIndex2(int[] arr , int target , int index , ArrayList<Integer> listt){

        // Base case
        if(index == arr.length){
            return listt;
        }

        // Add index if match found
        if(arr[index]== target){
            listt.add(index);
        }

        // Recursive call
        return FindAllIndex2(arr, target, index+1, listt);
    }
}
