package in.poorni.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.poorni.airlineapp.Login;

public class LoginValidation {
	private LoginValidation() {
		
	}
	
	public static boolean isValidUserName(String username) {
		boolean valid=false;
		String regex="^[a-zA-Z]{3,12}";
		if(Login.isEmptyString( username)) {
			Pattern pattern=Pattern.compile(regex);
			Matcher match=pattern.matcher(username);
			
			valid=match.matches();
		}
		return valid;
	}

}
