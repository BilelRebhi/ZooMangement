package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected Animal[] animals;
    protected String name;

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public static void setTotalAnimals(int totalAnimals) {
        Zoo.totalAnimals = totalAnimals;
    }

    public int getNbrAnimal() {
        return nbrAnimal;
    }

    public void setNbrAnimal(int nbrAnimal) {
        this.nbrAnimal = nbrAnimal;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(this.name !="")
        {this.name = name;
        }
    }

    protected String city;
    protected final int nbrCages = 25;
    protected int nbrAnimal = 0;
    protected static int totalAnimals = 0;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entities.Zoo: " + name + " | Ville: " + city + " | Nombre de cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages
                + ", animaux dans ce zoo: " + nbrAnimal + ", total animaux: " + totalAnimals + "}";
    }

    public void  addAnimal(Animal animal)  throws ZooFullException{
        if (isZooFull()) {
            throw new ZooFullException("Plus de cages disponibles dans ce zoo.");
        }
        animals[nbrAnimal] = animal;
        nbrAnimal++;
        totalAnimals++;

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
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
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