package Recursion.Patterns;

class Q1Triangles{
    public static void main(String[] args) {
        Traingle2(5 , 0);
        
    }

    public static void Traingle(int row , int col){
        if(row == 0 ){
            return ;
        }
        
        if(col < row){
            System.out.print("*");
            Traingle(row, col+1) ;
             
        }else{
        System.out.println("");
        Traingle(row-1, 0);
        }
        
    }
    public static void Traingle2(int row , int col){
        if(row == 0 ){
            return ;
        }
        
        if(col < row){
            
            Traingle2(row, col+1) ;
            System.out.print("*"); 
        }else{
        Traingle2(row-1, 0);
        System.out.println("");
        }
        
    }
}