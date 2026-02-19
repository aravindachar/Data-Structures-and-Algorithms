package Recursion.Arrays;

public class Q4Searching {

    public static void main(String[] args) {

        // Sample array
        int[] arr = {1,2,3,4,5,5,6};

        // Boolean search: checks if target exists
        System.out.println(Searching(arr, 41, 0));

        // Returns FIRST index of target
        System.out.println(SearchingIndex(arr, 1, 0));

        // Returns LAST index of target
        System.out.println(SearchingIndexLast(arr, 1, arr.length-1));
    }

    // ----------------------------------------------------
    // SEARCHING BOOLEAN (Does target exist?)
    // ----------------------------------------------------
    static boolean Searching(int[] arr , int target , int index){

        // Base case: reached end → target not found
        if(index == arr.length){
            return false ;
        }

        // If current element matches target
        else if (arr[index]==target){
            return true ;
        }

        // Recursive call: move to next index
        else{
            return Searching(arr, target, index+1);
        }
    }

    // ----------------------------------------------------
    // SEARCH FIRST OCCURRENCE (returns index)
    // ----------------------------------------------------
    static int SearchingIndex(int[] arr , int target , int index){

        // Base case: end reached → not found
        if(index == arr.length){
            return -1 ;
        }

        // Found target → return index immediately
        else if (arr[index]==target){
            return index ;
        }

        // Otherwise search remaining array
        else{
            return SearchingIndex(arr, target, index+1);
        }
    }

    // ----------------------------------------------------
    // SEARCH LAST OCCURRENCE (from back)
    // ----------------------------------------------------
    static int SearchingIndexLast(int[] arr , int target , int index){

        // Base case: crossed beginning → not found
        if(index == -1){
            return -1 ;
        }

        // If match found from back → return index
        else if (arr[index]==target){
            return index ;
        }

        // Recursive call: move backwards
        else{
            return SearchingIndexLast(arr, target, index-1);
        }
    }
}
