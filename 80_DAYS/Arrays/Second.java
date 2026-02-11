package Arrays;

import javax.print.attribute.IntegerSyntax;

// find the Second Largest and Smallest Element ion java
class Second{
    // Better Appporach 
    public static void GetElement(int arr[]){
        // intialize the values first

        int smallest = Integer.MAX_VALUE ,  Second_smallest = Integer.MAX_VALUE ;
        int Largest = Integer.MIN_VALUE ,  Second_Largest = Integer.MIN_VALUE ;
    
        // cheach the base case that is if the array is is small return - 1 ;
        if(arr.length == 1 || arr.length == 2){
            return;
        }
        for(int i = 0 ; i < arr.length-1 ; i++){
            smallest = Math.min(smallest, arr[i]);
            Largest = Math.max(Largest, arr[i]);
        }
        System.out.println(smallest);
        System.out.println(Largest);
        for(int i = 0 ; i <= arr.length-1 ; i++){
            if(arr[i]  < Second_smallest  && arr[i] !=smallest){
                Second_smallest = arr[i];
            }
        if(arr[i]  > Second_Largest  && arr[i] !=Largest){
                Second_Largest = arr[i];
            }
        }
        System.out.println(Second_Largest);
        System.out.println(Second_smallest);    
        

        }
    // Optimal Approach where we directly comparegi
    public static void SecondLargest(int arr[]){
        int Largest = Integer.MIN_VALUE;
        int Second_Largest = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] > Largest ){
                Second_Largest = Largest;
                Largest = arr[i];
            }
            else if(arr[i] > Second_Largest && arr[i] < Largest){
                Second_Largest = arr[i];
            }
        }
        System.out.println(Largest);
        System.out.println(Second_Largest);
    }
    public static void SecondSmallest(int arr[]){
        int Smallest = Integer.MAX_VALUE;
        int Second_Smallest = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] < Smallest ){
                Second_Smallest = Smallest;
                Smallest = arr[i];

            }
            else if(arr[i] < Second_Smallest && arr[i] > Smallest){
                Second_Smallest = arr[i];
            }
        }
        System.out.println("smallest :"+ Smallest);
        System.out.println("Second smallest :"+ Second_Smallest);

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,6,7,7};
        SecondLargest(arr);
        SecondSmallest(arr);

    }
}