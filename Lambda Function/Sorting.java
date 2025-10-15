package org.example.Functional_Interface;
import java.util.*;

@FunctionalInterface
interface Sort{
    void filter();
}

public class Sorting {
    public static void main(String[] args) {
        Sort price = () -> System.out.println("Pricing filter");
        Sort rating = () -> System.out.println("Sort by rating");
        Sort discount = () -> System.out.println("Maximum discount");
        Scanner input = new Scanner(System.in);
        String n = input.next();
        if (n.equals("price")) {
            price.filter();
        } else if (n.equals("rating")) {
            rating.filter();
        } else if (n.equals("discount")) {
            discount.filter();
        }
    }
}
