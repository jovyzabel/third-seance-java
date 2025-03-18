package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Horse p = new Pegasus("Pegase-1");
        p.move(50, 30);

        Pegasus p1 = new Pegasus("Pegase-2");
        p1.fly(30);

        Horse h1 = new Horse("Jolly-Jumper");
        h1.move(100,300);

        Scanner choice = new Scanner(System.in);
        try {
            System.out.println("Enter what we want! ");
            int myChoice = choice.nextInt();
            System.out.println(myChoice);
        }
        catch (InputMismatchException e){
            System.out.println("ERROR : "+ e.getMessage() +" You should enter a number!");
        }
        finally {
            System.out.println("Be sure!");

        }
    }
}