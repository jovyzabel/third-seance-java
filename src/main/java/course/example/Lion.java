package course.example;

public class Lion extends Feline{
    public Lion(){
        this.name = "King of the Jungle !";
    }

    @Override
    public void sleep() {
        System.out.println("Il dors 16h par jour ...");
    }
}
