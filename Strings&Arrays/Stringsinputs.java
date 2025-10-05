import java.util.Scanner;

public class Stringsinputs {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = "1 2 4 4";
        String[] numberr = number.trim().split("\\s+");
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++){
            array[i] = Integer.parseInt(numberr[i]);
        }
        System.out.println(array[1]);
    }
}
