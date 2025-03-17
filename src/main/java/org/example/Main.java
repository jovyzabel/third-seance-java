package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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