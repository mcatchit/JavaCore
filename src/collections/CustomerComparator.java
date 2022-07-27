package collections;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

    private static int PRIORITY_AGE = 60;

    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getAge() > PRIORITY_AGE && o2.getAge() < PRIORITY_AGE) {
            return -1;
        }
        if (o2.getAge() > PRIORITY_AGE) {
            return 1;
        }
        if (o1.getCard() == CardType.VIP && o2.getCard() != CardType.VIP) {
            return -1;
        }
        if (o2.getCard() == CardType.VIP) {
            return 1;
        }
        return 0;
    }
}
