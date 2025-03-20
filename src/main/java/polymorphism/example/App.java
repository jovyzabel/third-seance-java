package polymorphism.example;

import interfce.example.Flyable;
import interfce.example.Glider;
import interfce.example.Ship;
import interfce.example.Vehicle;

public class App {
    public static void main(String[] args){
        Vehicle[] vehicles = {new Ship(), new Moto(), new Glider()};
        Flyable[] flyables = {new Moto(), new Glider(), new Glider()};

        for(Vehicle vehicle : vehicles)
            vehicle.moveXY(50,50);

        for(Flyable flyable : flyables)
            flyable.fly("Gaz");
    }
}
