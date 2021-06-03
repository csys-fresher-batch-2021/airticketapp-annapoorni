package in.poorni.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterValidation {
	private RegisterValidation() {

	}

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

	public static boolean isValidPassword(String password) {
		boolean isValid = false;

		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[#?!@$%^&*-]).{8,}$";
		if (UserdetailSetValidation.isEmptyString(password)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(password);

			isValid = match.matches();

		}

		return isValid;
	}

	public static boolean isValidEmail(String password) {
		boolean isValid = false;

		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		if (UserdetailSetValidation.isEmptyString(password)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(password);

			isValid = match.matches();

		}

		return isValid;
	}

	public static boolean isValidAge(String age) {
		boolean isValid = false;

		if (UserdetailSetValidation.isEmptyString(age)) {
			int i = Integer.parseInt(age);
			if ((i > 0) && (i < 60)) {
				isValid = true;

			}

		}

		return isValid;
	}

	public static boolean isValidMobileno(String password) {
		boolean isValid = false;

		String regex = "^[0-9]{10}$";
		if (UserdetailSetValidation.isEmptyString(password)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(password);

			isValid = match.matches();

		}

		return isValid;
	}

	public static boolean isValidAdhaarNo(String password) {
		boolean isValid = false;

		String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
		if (UserdetailSetValidation.isEmptyString(password)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(password);

			isValid = match.matches();

		}

		return isValid;
	}

	public static boolean isValidPincode(String password) {
		boolean isValid = false;

		String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		if (UserdetailSetValidation.isEmptyString(password)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(password);

			isValid = match.matches();

		}

		return isValid;

	}

}
