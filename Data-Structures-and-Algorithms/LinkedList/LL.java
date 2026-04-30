class LL{
    private Node head ;
    private Node tail ;
    private int size ;
    public LL(){
        size = 0 ;
    }

    public void InsertFirst(int value){
        Node node = new Node(value);
        if(tail == null){
            tail = head ;

        }
        node.next = head ;
        head = node ;
        size ++ ;

    }
    public void InsertLast(int value){
        if(size == 0){
            InsertFirst(value);
            return ;
        }
        Node node = new Node(value);
            tail.next = node ;
            tail = node ;
            size ++ ;
        
    }
    public void Insert(int value , int index){
        if(index == 0){
            InsertFirst(value);
            return ;
        }
        if(index == size){
            InsertLast(value);
            return ;

        }
        Node temp = head ;
        for(int i = 1 ; i < index; i++){
            temp = temp.next ;
        }
        Node node = new Node(value , temp.next);
        temp.next = node ;
        size ++ ;
    }
    public void DeleteFast(){
        int val = head.value ;
        head = head.next ;
        if(head == null){
            tail = null ;
        }
        size -- ;
    }
    public Node get(int index){
        Node temp = head ;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next ;
        }
        return temp ;
    }
    public void DeleteLast(){
        if(size <=1 ){
            DeleteFast();
            return;
        }
        Node secondlast = get(size-1);
        int val = tail.value ;
        tail = secondlast ;
        tail.next = null ;
        size-- ;
        System.out.println(val);
    }

    // deleete
    public void Delete(int index){
        if(index <=0){
            DeleteFast();
            return;
        }
        if(index == size){
            DeleteLast();
            return ;
        }
        Node temp = get(index-1);
        int val = temp.value ;
        temp.next = temp.next.next ;
        size -- ;
        System.out.println(val);

    }
    public void Find(){}
    public void display(){
        Node temp = head ;
        for(int i = 0 ; i < size ; i ++){
            System.out.print(temp.value + "==>");
            temp = temp.next ;
        }
        System.out.print("END");
    }

    private class Node{
        private int value ;
        private Node next ;
        private Node(int value){
            this.value = value ;
            
        }
        private Node(int value , Node next){
            this.value = value ;
            this.next = next ;
        }
    }

    public static void main(String[] args) {
        
    }
}