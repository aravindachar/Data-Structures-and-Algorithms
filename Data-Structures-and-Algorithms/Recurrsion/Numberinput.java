package Recurrsion;


public class Numberinput {
    public static void main(String[] args) {
        System.out.println("hell");
        message(23);
    }
    static void message(int num){
        if(num >25){
            return ;
        }
        System.out.println(num);
        num ++ ;
        message(num);

    }
    
}
