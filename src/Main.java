public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Zoo myZoo = new Zoo("Safari Zoo", "Tunis", 25);
        myZoo.animals[0] = lion;
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println("Mon zoo est : " + myZoo);
        lion.display();
        System.out.println(lion);
    }
    }

