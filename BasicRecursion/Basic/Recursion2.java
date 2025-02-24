// Print 1 to N using Recursion
public class Recursion2 {
    
    static void func(int i , int n ){
        if(i>n) return ;
        
        System.out.println(i);

        func(i+1 , n);
    }
    // static void func2(int i , int n ){
    //     if(i<1) return;
    //     func(i-1, n);
    //     System.out.println(i);
    // }
    public static void main(String[] args) {
        int n = 5 ;
        func(1, n);
        // func2(1, n);

    }   
}


