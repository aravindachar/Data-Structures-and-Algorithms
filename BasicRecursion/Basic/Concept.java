public class Concept {
    public static void main(String[] args) {
        substarct(3);

    }
    static int substarct(int n ){
        if(n ==0){
            return 1;
        }
        System.out.println(n);
        return substarct(--n);
    }
}
