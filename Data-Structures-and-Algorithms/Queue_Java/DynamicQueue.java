package Queue_Java;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }
    @Override
    // the method is overidden and allcated the extra space by creating the new temp arry 
    public boolean insert(int item){
        if(isEmpty()){
            int[] temp = new int[data.length * 2] ;
            for(int i = 0 ; i < data.length ; i ++){
                temp[i] = data[i];
                // this is temp rary 
                
            }
            data = temp ;
            
        }
        return super.insert(item);
    }
}
