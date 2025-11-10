package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
public class ZooTest {
    public static void main(String[] args) {
        Aquatic fish = new Aquatic("Fish");
        Penguin penguin = new Penguin("Penguin");
        Terrestrial bear = new Terrestrial("Bear");

        System.out.println("\n--- Aquatic ---");
        fish.eatMeat(Food.MEAT);

        System.out.println("\n--- Penguin ---");
        penguin.eatMeat(Food.MEAT);

        System.out.println("\n--- Terrestrial ---");
        bear.eatMeat(Food.MEAT);
        bear.eatPlant(Food.PLANT);
        bear.eatPlantAndMeet(Food.BOTH);
    }
}
