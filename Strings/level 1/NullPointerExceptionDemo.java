public class NullPointerExceptionDemo {
    
    public static void generateException() {
        String text = null;
        try {
            System.out.println("Trying to access String method");
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught in generateException!");
            System.out.println("Error: Cannot call methods on null reference");
            throw new RuntimeException("RuntimeException thrown from generateException", e);
        }
    }
    
    public static void demonstrateNullPointerException() {
        String text = null;
        try {
            System.out.println("Demonstrating NullPointerException");
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in demonstrateNullPointerException!");
        }
    }
    
    public static void main(String[] args) {
        demonstrateNullPointerException();
        
        System.out.println("\nCalling generateException method:");
        try {
            generateException();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught in main: " + e.getMessage());
        }
    }
}
