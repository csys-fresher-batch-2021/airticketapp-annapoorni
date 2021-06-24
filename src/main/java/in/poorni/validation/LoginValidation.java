package in.poorni.validation;


import in.poorni.util.PasswordValidation;
import in.poorni.util.StringValidation;

public class LoginValidation {
	private LoginValidation() {
		// Default Constructor
	}
	public static boolean isLoginValidation(String username,String password) {
		boolean isValid = false;
		try {
			boolean isValidUser = StringValidation.isValidString(username,"Invalid User Name");
			boolean isValidPass = PasswordValidation.isPasswordValid(password,"Invalid password");
			if(isValidUser && isValidPass) {
				isValid = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return isValid;
	}
}










