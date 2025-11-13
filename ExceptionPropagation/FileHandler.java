package ExceptionPropagation;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandler {
 private FileInputStream in;

 public FileHandler(String path) throws IOException {
     File f = new File(path);
     if (!f.exists()) {
         throw new FileNotFoundException("File not found: " + path);
     }
     this.in = new FileInputStream(f);
     System.out.println("FileHandler opened: " + path);
 }

 public void close() {
     if (in != null) try { in.close(); } catch (IOException ignored) {}
 }
}
