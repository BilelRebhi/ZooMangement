public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Zoo", "Tunis");

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal bear = new Animal("Ursidae", "Bear", 7, false);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        System.out.println("Ajout du lion: " + myZoo.addAnimal(lion));
        System.out.println("Ajout du tigre: " + myZoo.addAnimal(tiger));
        System.out.println("Ajout de l'ours: " + myZoo.addAnimal(bear));
        System.out.println("Ajout de l'éléphant: " + myZoo.addAnimal(elephant));

        myZoo.displayAnimals();

        Animal lionDuplicate = new Animal("Felidae", "Lion", 5, true);
        Animal simba = new Animal("Felidae", "Simba", 5, true);
        System.out.println("Index du lion: " + myZoo.searchAnimal(lion));
        System.out.println("Index du lion dupliqué: " + myZoo.searchAnimal(lionDuplicate));
        System.out.println("Index de Simba: " + myZoo.searchAnimal(simba));

        System.out.println("\nTest d'ajout au-delà de la capacité:");
        for (int i = 0; i < 30; i++) {
            Animal animal = new Animal("TestFamily", "Animal" + i, 3, true);
            System.out.println("Ajout de Animal" + i + ": " + myZoo.addAnimal(animal));
        }

        System.out.println("\nSuppression du tigre: " + myZoo.removeAnimal(tiger));
        System.out.println("Suppression de Simba: " + myZoo.removeAnimal(simba));
        myZoo.displayAnimals();

        System.out.println("\nLe zoo est-il plein ? " + myZoo.isZooFull());

        Zoo zoo2 = new Zoo("Jungle Zoo", "Sousse");
        zoo2.addAnimal(new Animal("Canidae", "Wolf", 6, true));
        zoo2.addAnimal(new Animal("Ursidae", "PolarBear", 8, true));
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, zoo2);
        System.out.println("\nZoo avec le plus d'animaux: " + biggerZoo.name);
    }
}