package Login;

public class LoginSystem {
	static void validate(String user, String pass) throws InvalidCredentialsException{
		String validUser="admin";
		String validPass="admin@123";
		
		if(!user.equals(validUser)||!pass.equals(validPass))
		{
			throw new InvalidCredentialsException("invalid Username or Password");
		}
		else {
			System.out.println("Welcome");
		}
	}

}
