package polymorphism.example;

public class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
