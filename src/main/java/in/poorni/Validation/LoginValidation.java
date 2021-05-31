package in.poorni.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidation {
	public static boolean isValidUserName(String userName) {
	boolean isValid = false;
	String regex = "^[a-zA-Z]{3,12}";
	if (UserdetailSetValidation.isEmptyString(userName)) {
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(userName);
		isValid = match.matches();
	}
	return isValid;
}
public static boolean isEmptyString(String userName) {
		boolean isValid=false;
		
		if(!(userName.trim().equals(""))) {
			isValid=true;
			
		}
		return isValid;
	}


}
