package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Carnivore;
public class Aquatic  implements Carnivore<Food> {
    private String habitat;

    public Aquatic() {}

    public String getName() {
        return name;
    }

    private String name;

    public Aquatic(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return "Aquatic{name='" + getName() + "', habitat='" + habitat + "'}";
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " eats meat from the water!");
        } else {
            System.out.println(name + " cannot eat plants!");
        }
    }
}
