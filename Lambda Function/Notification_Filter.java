package org.example.Functional_Interface;
import java.util.*;

@FunctionalInterface
interface Filter{
    void nofi();
}

public class Notification_Filter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String n = input.next();
        Filter red = () -> System.out.print("Red alert: Emergency!" +
                "\nReach hospital immediately.");
        Filter yellow = () -> System.out.print("Yellow alert" +
                "\nSee your Doctor.");
        Filter green = () -> System.out.print("Green" +
                "\nNot in danger");
        if(n.equals("red")){
            red.nofi();
        }
        else if (n.equals("yellow")) {
            yellow.nofi();
        }
        else if (n.equals("green")) {
            green.nofi();
        }
    }
}
