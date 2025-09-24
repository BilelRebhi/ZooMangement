public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int nbrAnimal = 0;
    static int totalAnimals = 0;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    public void displayZoo() {
        System.out.println("Zoo: " + name + " | Ville: " + city + " | Nombre de cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages
                + ", animaux dans ce zoo: " + nbrAnimal + ", total animaux: " + totalAnimals + "}";
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal est déjà présent dans le zoo.");
            return false;
        }
        if (isZooFull()) {
            System.out.println("Plus de cages disponibles dans ce zoo.");
            return false;
        }
        animals[nbrAnimal] = animal;
        nbrAnimal++;
        totalAnimals++;
        return true;
    }

    public void displayAnimals() {
        if (nbrAnimal == 0) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            System.out.println("Animaux dans le zoo " + name + " :");
            for (int i = 0; i < nbrAnimal; i++) {
                if (animals[i] != null) {
                    animals[i].display();
                }
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal n'est pas dans le zoo.");
            return false;
        }
        for (int i = index; i < nbrAnimal - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimal - 1] = null;
        nbrAnimal--;
        totalAnimals--;
        return true;
    }

    public boolean isZooFull() {
        return nbrAnimal >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimal >= z2.nbrAnimal) {
            return z1;
        } else {
            return z2;
        }
    }
}