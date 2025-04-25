package interfce.example;

public interface Flyable {
    public void fly(final String energy);

    /*default Method if a class does not redefine it*/
    public default void test(){
        System.out.println("Default behavior");
    }
}
