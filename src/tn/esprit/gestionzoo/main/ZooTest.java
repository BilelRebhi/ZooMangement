package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
public class ZooTest {
    public static void main(String[] args) {
        Aquatic aquatic = new Aquatic("Fish", "Ocean");
        Terrestrial terrestrial = new Terrestrial("Lion", 4);
        Dolphin dolphin = new Dolphin("Dolphin", "Sea", 25.5f);
        Penguin penguin = new Penguin("Penguin", "Antarctica", 50.0f);

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
