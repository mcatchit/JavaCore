package abstract_classes;

public class Accessory {
    private String name;
    private double cost;

    public Accessory(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
