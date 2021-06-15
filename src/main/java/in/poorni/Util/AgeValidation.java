package in.poorni.Util;

import in.poorni.Exception.UtilException;

public class AgeValidation {
	private AgeValidation() {
		// Default Constructor
	}
	public static boolean isValidAge(int value, String message) {
		boolean isValid = false;
		if (value >= 0 && value <= 100) {
			isValid = true;
		} else {
			throw new UtilException(message);
		}
		return isValid;
	}
}

