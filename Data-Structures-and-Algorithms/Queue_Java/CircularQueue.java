package Queue_Java;

public class CircularQueue {
    protected int data[];
    private static final int DEFAULT_SIZE = 10 ;
    protected int end = 0 ;
    protected int front = 0 ;
    int size = 0 ;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
            this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length ;
    }
    public boolean isEmpty(){
        return size == 0 ;
    }
}
