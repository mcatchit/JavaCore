package abstract_classes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Flower[] flowers = new Flower[]{
                new Flower(FlowerType.ROSE, 12.0, 23, 1),
                new Flower(FlowerType.TULIP, 14.0, 27, 3),
                new Flower(FlowerType.ROSE, 19.0, 29, 4),
                new Flower(FlowerType.CAMOMILE, 11.0, 33, 7),
                new Flower(FlowerType.ROSE, 16.0, 67, 10)
        };

        Accessory[] accessories = new Accessory[]{
                new Accessory("Stripe", 34.00),
                new Accessory("Paper", 1.00),
        };

        Bunch bunch = new Bunch(flowers, accessories);

        System.out.println("Total cost: " + bunch.getCost());

        bunch.sortFlowers();
        System.out.println(Arrays.toString(bunch.getFlowers()));

        System.out.println("Flower between 26 and 50" + bunch.findFlower(26, 50));
    }
}
