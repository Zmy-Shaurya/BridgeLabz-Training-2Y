package Login;
import java.util.*;
public class Runner {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			try {
				System.out.print("Username: ");
				String user = input.next();
				System.out.print("Password: ");
				String pass = input.next();
				LoginSystem.validate(user, pass);
			}
			catch(InvalidCredentialsException e) {
				System.out.println(e.getMessage());
			}
		}
	
}
