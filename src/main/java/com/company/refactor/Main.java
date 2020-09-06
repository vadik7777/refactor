package com.company.refactor;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Терминатор", 0);
        Movie movie2 = new Movie("Терминатор2", 1);
        Movie movie3 = new Movie("Властелин колец", 2);
        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie1, 2);
        Rental rental3 = new Rental(movie2, 1);
        Rental rental4 = new Rental(movie3, 1);
        Customer customer1 = new Customer("Ivan");
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        customer1.addRental(rental3);

        Customer customer2 = new Customer("Pety");
        customer1.addRental(rental2);
        customer1.addRental(rental3);
        customer1.addRental(rental4);

        System.out.println(customer1.statement());
        System.out.println(customer2.statement());
    }
}
