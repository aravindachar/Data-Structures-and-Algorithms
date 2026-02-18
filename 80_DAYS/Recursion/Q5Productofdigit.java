package Recursion;

public class Q5Productofdigit {
    public static void main(String[] args) {
        int ans = Productofdigit(433);
        System.out.println(ans);
    }
    static int Productofdigit(int n){
        if(n%10 == n){
            return n ;
        }
        return n%10 * Productofdigit(n/10);
    }
}
