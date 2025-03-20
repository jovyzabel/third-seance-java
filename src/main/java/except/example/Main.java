package except.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Exceptions try/catch");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter values here :  ");
        int value = s.nextInt();
        int j = s.nextInt();

        try {
            int remainder = value/j;
        }
        catch (ArithmeticException e){
            System.out.println("ERROR....");
            System.out.println("getMessage");
            System.out.println(e.getMessage());
            System.out.println(" ");
            System.out.println("toString");
            System.out.println(e.toString());
            System.out.println(" ");
            System.out.println("printStackTrace");
            e.printStackTrace();

        }

    }
}
