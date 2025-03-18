package course.example;

public class Tiger extends Feline{
    public Tiger(){
        this.name = "Tiger";
    }

    @Override
    public void sleep() {
        System.out.println("Il dors 9h par jour ...");
    }
}
