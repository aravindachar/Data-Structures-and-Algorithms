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

    public boolean insert(int item){
        if(isFull()){
            return false ;
        }
        data[end++] = data[item];
        end = end% data.length ;
        size ++ ; 
        return true ;
    }
    // remove
        public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("The queue is empty");
        }
        // The item to be removed is always at the front (index 0).
        int removed = data[0];
        // Decrement the size of the queue.
        size--;
        return removed;
    }
// display
    public void display(){
        if(isEmpty()){
            System.out.println("the quue is empty");
            return ;
        }
        int i = front ;
        do{
            System.out.println(data[i]+"==>");
            i ++ ;
            i %= data.length ;
        }while(i != end);
        System.out.println("");
    }
    public boolean isFull(){
        return size == data.length ;
    }
    public boolean isEmpty(){
        return size == 0 ;
    }
}
