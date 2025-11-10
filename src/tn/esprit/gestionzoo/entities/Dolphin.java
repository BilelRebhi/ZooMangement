package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {

    public Dolphin() {}

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin{name='" + getName()  + "}";
    }
}
