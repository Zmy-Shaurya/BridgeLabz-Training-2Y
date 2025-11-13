package NestedTrycatch;


public class PropagationDemo {
 public void methodB(String s) {
     try {
         Integer.parseInt("notANumber"); // This is caught locally
     } catch (NumberFormatException e) {
         System.out.println("Caught in methodB: " + e);
     }
     // Another exception that will propagate
     if (s == null) {
         throw new NullPointerException("s is null");
     }
     System.out.println("methodB done with s=" + s);
 }

 public void methodA() {
     methodB(null); // triggers NPE propagation to caller
 }
}

