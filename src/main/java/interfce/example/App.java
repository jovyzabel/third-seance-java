package interfce.example;

public class App {
    public static void main(String[] args){
        System.out.println("_____Interface_____");

        Ship ship = new Ship();
        ship.moveXY(50,50);

        Glider glider = new Glider();
        glider.fly("Gaz");
        glider.test();

        Cottage c = new Cottage();
        c.build("Wood");

    }
}
