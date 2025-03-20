package interfce.example;

public class Ship extends Vehicle{

    public Ship(){
        this.mvSpeed = 27;
    }
    @Override
    public void moveXY(int coordX, int coordY) {
        System.out.println("Its new position is "+coordX+" and "+coordY);
    }
}
