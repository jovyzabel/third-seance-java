package polymorphism.example;

import interfce.example.Flyable;
import interfce.example.Vehicle;

public class Moto extends Vehicle implements Flyable {

    public Moto(){
        this.mvSpeed =250;
    }

    @Override
    public void moveXY(final int coordX, final int coordY) {
        System.out.println("---MOTO----");
        System.out.println("Je suis une moto Spécial.");
    }

    @Override
    public void fly(String energy) {
        System.out.println("---MOTO----");
        System.out.println("Flying with "+energy);
    }
}
