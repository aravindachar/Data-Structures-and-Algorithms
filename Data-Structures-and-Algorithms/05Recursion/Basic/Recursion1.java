// Print Name N times using Recursion
// seudo code 
// void func( i, n )
// {
//    if(i>n) return;
//  print(“Raj”);
//    f( i+1,N );
// }
// main() 
// {
//   int n;
//   input(n);
//   f(1,n);
// }
public class Recursion1 {
    static void func(int i , int n ){
        //Base codition 
        if(i>n) return;
        // else prith the statement
        System.out.println("aravinda");

        func(i+1, n);
    }
    public static void main(String[] args) {
        // let us cosider n = 5
        int n = 5 ;
        func(1, 5);
    }
}

// Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }

// Space Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.z\