public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int bs = search(arr, 2, 1, 7);
    }
    static int search(int[] arr , int target, int s , int e){
        if(s>e){
            return -1 ;
        }
        m = s + (e-1)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]<target){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m, e);

    }
}
