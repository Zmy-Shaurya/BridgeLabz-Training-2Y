package ExceptionPropagation;


public class FileHandlerMain {
 public static void main(String[] args) {
     try {
         FileHandler fh = new FileHandler("missing.txt"); // adjust path if needed
         fh.close();
     } catch (java.io.IOException e) {
         System.out.println("Could not initialize FileHandler: " + e.getMessage());
     }
 }
}
