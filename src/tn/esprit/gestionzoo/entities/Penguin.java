package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {

    public Penguin() {}

    public Penguin(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return "Penguin{name='" + getName() +  "}";
    }
    @Override
    public void eatMeat(Food meat) {
        System.out.println("Penguin prefers fish (meat)!");
        super.eatMeat(meat);
    }
}
