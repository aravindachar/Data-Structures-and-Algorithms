package TREES;

public class BST2 {
    public class Node{
        private int value ;
        private int height ;
        private Node left ;
        private Node right ;

        public Node(int value){
            this.value = value ;
        }

        public int getvalue(){
            return this.value ;
        }

    }
    private Node root ;
    public BST2(){

    }
    public int height(Node node){
        if(root == null){
            return -1 ;
        }
        return root.height ;
    }
    public boolean isEmpty(){
        return root== null ;
    }
    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value ,Node node ){
        if(node == null ){
            return new Node(value);
        }
        if(value  < node.value){
            node.left = insert(value , node.left);
        }
        else{
            node.right = insert(value , node.right);
        }
        node.height = Math.max(height(node.left) , height(node.right))+1 ;
        return node ;
    }
    public boolean Balanced(){
        return Balanced(root);
    }
    private boolean Balanced(Node node){
        if(node == null){
            return true ;
        }
        return Math.abs(height(node.left)-height(node.right)) <=1 && Balanced(node.left) && Balanced(node.right);
    }
    public void Display(){
        Display(this.root , "root Node :");
    }
    private void Display(Node node , String Details){
        if(node == null){
            return;
        }
        System.out.println(Details + node.value);
        Display(node.left , "Left Chile of " + node.value + " " );
        Display(node.right , "Left Chile of " + node.value + " " );
    }   

}
