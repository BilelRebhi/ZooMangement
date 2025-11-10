package tn.esprit.gestionzoo.entities;

public class Terrestrial implements Omnivore<Food>{
    private int nbrLegs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    public Terrestrial() {}

    public Terrestrial(String name) {
        this.name = name;

    }



    @Override
    public String toString() {
        return "Terrestrial{name='" + getName() +  "}";
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " eats meat on land!");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(name + " eats plants on land!");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(name + " eats both plants and meat!");
        }
    }
}
