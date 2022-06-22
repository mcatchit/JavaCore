package abstract_classes;

public class Bunch {

    private Flower[] flowers;

    private Accessory[] accessories;

    public Bunch(Flower[] flowers, Accessory[] accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public double getCost() {
        double totalSum = 0;
        for (int flowerIndex = 0; flowerIndex < flowers.length; flowerIndex++) {
            totalSum += flowers[flowerIndex].getCost();
        }
        for (int accesoireIndex = 0; accesoireIndex < accessories.length; accesoireIndex++) {
            totalSum += accessories[accesoireIndex].getCost();
        }
        return totalSum;
    }

    public void sortFlowers() {
        int lastIndex = flowers.length - 1;

        for (int firstUnsortedIndex = 0; firstUnsortedIndex <= lastIndex; firstUnsortedIndex++) {

            Flower firstUnsortedFlower = flowers[firstUnsortedIndex];
            int maxFreshness = firstUnsortedFlower.getFreshness();
            int freshestFlowerIndex = firstUnsortedIndex;

            for (int currentIndex = firstUnsortedIndex; currentIndex <= lastIndex; currentIndex++) {
                Flower flower = flowers[currentIndex];
                if (flower.getFreshness() > maxFreshness) {
                    maxFreshness = flower.getFreshness();
                    freshestFlowerIndex = currentIndex;
                }
            }

            if (freshestFlowerIndex != firstUnsortedIndex) {
                Flower freshestFlower = flowers[freshestFlowerIndex];
                flowers[firstUnsortedIndex] = freshestFlower;
                flowers[freshestFlowerIndex] = firstUnsortedFlower;
            }
        }
    }

    public Flower findFlower(int minLength, int maxLength) {
        for (int flowerIndex = 0; flowerIndex < flowers.length; flowerIndex++) {
            Flower currentFlower = flowers[flowerIndex];

            if (currentFlower.getLength() > minLength && currentFlower.getLength() < maxLength) {
                return currentFlower;
            }
        }
        throw new RuntimeException("Flower not found");
    }

    public Flower[] getFlowers() {
        return flowers;
    }
}
