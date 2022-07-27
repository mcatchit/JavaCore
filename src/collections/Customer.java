package collections;

import java.util.Objects;

public class Customer {

    private final String name;
    private final int age;
    private final CardType card;

    public Customer(String name, int age, CardType card) {
        this.name = name;
        this.age = age;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public CardType getCard() {
        return card;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name) && card == customer.card;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, card);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", card=" + card +
                '}';
    }
}
