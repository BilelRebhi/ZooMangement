package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari tn.esprit.gestionzoo.entities.Zoo", "Tunis");

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal bear = new Animal("Ursidae", "Bear", 7, false);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(tiger);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimal());


        myZoo.displayAnimals();

        Animal lionDuplicate = new Animal("Felidae", "Lion", 5, true);
        Animal simba = new Animal("Felidae", "Simba", 5, true);
        System.out.println("Index du lion: " + myZoo.searchAnimal(lion));
        System.out.println("Index du lion dupliqué: " + myZoo.searchAnimal(lionDuplicate));
        System.out.println("Index de Simba: " + myZoo.searchAnimal(simba));



        System.out.println("\nSuppression du tigre: " + myZoo.removeAnimal(tiger));
        System.out.println("Suppression de Simba: " + myZoo.removeAnimal(simba));
        myZoo.displayAnimals();

        System.out.println("\nLe zoo est-il plein ? " + myZoo.isZooFull());

        Zoo zoo2 = new Zoo("Jungle tn.esprit.gestionzoo.entities.Zoo", "Sousse");
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, zoo2);
        System.out.println("\ntn.esprit.gestionzoo.entities.Zoo avec le plus d'animaux: " + biggerZoo.getName());
    }
}