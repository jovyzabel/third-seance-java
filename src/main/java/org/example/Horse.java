package org.example;

public class Horse {
    protected String name;
    protected int coordX ;
    protected int coordY ;
    public Horse(final String name){
           this.name = name;
           this.coordX = 50;
           this.coordY = 50;
    }
    public void move(final int x, final int y){
        this.coordX = x;
        this.coordY = y;
        System.out.println("le cheval marche. x= "+this.coordX+" ,y="+this.coordY);

    }

}
