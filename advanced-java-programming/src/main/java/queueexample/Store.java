package queueexample;

import java.util.LinkedList;

public class Store {
    public static void main(String[] args){
        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);

    }
}
