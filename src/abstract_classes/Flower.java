package abstract_classes;

public class Flower {

    private FlowerType type;

    private double cost;

    private int length;

    private int freshness;

    public Flower(FlowerType type, double cost, int length, int freshness) {
        this.type = type;
        this.cost = cost;
        this.length = length;
        this.freshness = freshness;
    }

    public FlowerType getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public int getFreshness() {
        return freshness;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "type=" + type +
                ", cost=" + cost +
                ", length=" + length +
                ", freshness=" + freshness +
                '}';
    }
}
