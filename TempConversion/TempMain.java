package TempConversion;


public class TempMain {
 public static void main(String[] args) {
     try {
         double out = TemperatureConverter.convert(-500, 'F');
         System.out.println("Converted: " + out);
     } catch (InvalidTemperatureException e) {
         System.out.println(e.getMessage());
     }
 }
}
