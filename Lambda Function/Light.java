package org.example.Functional_Interface;
import java.util.*;

@FunctionalInterface
interface Light_Automation{
    void light();
}

public class Light {
    public static void main(String[] args){
        Light_Automation motion = () -> System.out.println("Light On");
        Light_Automation afternoon = () -> System.out.println("Afternoon, Dim Light");
        Light_Automation voice = () -> System.out.print("voice activation");
        Scanner input = new Scanner(System.in);
        String n = input.next();
        if (n.equals("motion")){
            motion.light();
        }
        else if (n.equals("Afternoon")) {
            afternoon.light();
        }
        else if (n.equals("Voice")) {
            voice.light();
        }
    }
}