package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin() {}

    public Penguin(String name, String habitat, float swimmingDepth) {
        super(name, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{name='" + getName() + "', habitat='" + getHabitat() + "', swimmingDepth=" + swimmingDepth + "}";
    }
}
