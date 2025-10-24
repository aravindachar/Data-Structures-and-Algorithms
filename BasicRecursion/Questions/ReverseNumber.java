public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(124);
        
    }
    static int sum = 0 ;
    static void reverseNumber(int n ){
        if(sum ==0){
            return ;
        }
        int rev = n %10 ;
        sum = rev*10 ;
        System.out.println(rev);
        reverseNumber(n / 10);
    
    }
}
