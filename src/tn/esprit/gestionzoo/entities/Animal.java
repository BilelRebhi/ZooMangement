package tn.esprit.gestionzoo.entities;

public class Animal {

    private   String family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 )
        {
        this.age = age;}
    }

    private  int age;

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    private  boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void display() {
        System.out.println("tn.esprit.gestionzoo.entities.Animal: " + name +
                " | Famille: " + family +
                " | Âge: " + age +
                " | Mammifère: " + isMammal);
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{name='" + name +
                "', family='" + family +
                "', age=" + age +
                ", isMammal=" + isMammal + "}";
    }

}