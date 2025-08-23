package InterFaces;

public class Car implements Engine , Break {
// Interfaces doesnot care wheter the two clsess realated or it but in inheritace it doues 
    @Override
    public void start() {
        System.out.println("enigne start");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("engine will stop");
    }

    @Override
    public void acc() {
        System.out.println("engine will exalatrate");
    }
    public void Break(){
        System.out.println("the break is here");
    }
  
}
