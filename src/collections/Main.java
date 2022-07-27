package collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Hanna", 23, CardType.MEDIUM);
        Customer customer2 = new Customer("Peter", 60, CardType.STANDARD);
        Customer customer3 = new Customer("Olga", 89, CardType.STANDARD);
        Customer customer4 = new Customer("Vasil", 15, CardType.VIP);

        PriorityQueue<Customer> queue = new PriorityQueue<>(new CustomerComparator());
        queue.add(customer1);
        queue.add(customer2);
        queue.add(customer3);
        queue.add(customer4);

        printQueue(queue);

        printQueue(removeVips(queue));
    }

    private static void printQueue(Queue<Customer> queue){
        for (Customer customer : queue) {
            System.out.println(customer);
        }
        System.out.println("------------------\n");
    }

    private static Queue<Customer> removeVips(Queue<Customer> queue){
        Queue<Customer> resultQueue = new PriorityQueue<>();
        for (Customer customer : queue) {
            if(customer.getCard() != CardType.VIP){
                resultQueue.add(customer);
            }
        }
        return resultQueue;
    }
}
