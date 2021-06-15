package in.poorni.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import in.poorni.Exception.UtilException;


public class PasswordValidation {
	
	public static boolean isPasswordValid(String password,String message) {
		boolean isValid = false;
		if (password != null) {
			String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(password);
			isValid = m.matches();
		} else {
			throw new UtilException(message);
		}
		return isValid;
	}

}
