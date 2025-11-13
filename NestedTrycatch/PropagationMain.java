package NestedTrycatch;


public class PropagationMain {
 public static void main(String[] args) {
     PropagationDemo d = new PropagationDemo();
     try {
         d.methodA();
     } catch (NullPointerException e) {
         System.out.println("Propagated to main: " + e);
     }
 }
}
