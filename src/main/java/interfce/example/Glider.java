package interfce.example;

public class Glider extends Vehicle implements Flyable{
    public Glider(){
        this.mvSpeed = 33;

    }

    @Override
    public void moveXY(int coordX, int coordY) {
        System.out.println("---GLIDER----");
        System.out.println("Planning in the air with"+coordX+" and "+coordY);
    }

    @Override
    public void fly(String energy) {
        System.out.println("---GLIDER----");
        System.out.println("I fly in the air with "+energy);
    }

}
