package org.example;

public class Pegasus extends Horse{
    public int coordZ;
    public Pegasus(final String name){
        super(name);
        this.coordZ = 100;

    }

    public void fly(final int z){
        this.coordZ = z;
        System.out.println("le Pegase est dans les airs z= "+this.coordZ);
    }
    @Override
    //Redefinition de la methode
    public void move(final int x, final int y){
       System.out.println("Le pegase aussi marche comme seiya sur ("+x +", "+y+")");
    }
}
