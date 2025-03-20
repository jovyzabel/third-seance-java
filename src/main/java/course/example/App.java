package course.example;

public class App {
    public static void main(String[] args){
        Tiger t1 = new Tiger();
        System.out.println("I am "+t1.name);

        Lion l1 = new Lion();
        System.out.println("I am "+l1.name);
        l1.roar();
    }
}
