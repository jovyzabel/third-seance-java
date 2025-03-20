package interfce.example;

public class Cottage extends Building{
    public Cottage(){
        System.out.println("Parcelle en place");
    }
    @Override
    public void build(String materiel){
        System.out.println("Building with "+materiel);
    }
}
