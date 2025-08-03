
public class Main {
    public static void main(String[] args) {
        // Box box = new Box();
        // System.out.println(box.l);
        BoxWeight boxw1 = new BoxWeight(2 , 5,7,45);
        System.out.println(boxw1.l);
        BoxPrice boxp1 = new BoxPrice(23, 045,45, 450, 23);
        System.out.println(boxp1.h);
        BoxPrice boxsup = new BoxPrice(43);
        System.out.println(boxsup.price);
    }   
}
