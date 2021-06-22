package in.poorni.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.poorni.model.User;
import in.poorni.util.AgeValidation;
import in.poorni.util.EmailValidation;
import in.poorni.util.PhoneNumberValidation;
import in.poorni.util.StringValidation;
public class UserValidation {
	private UserValidation() {
		// default constructor
	}
	/**
	 * this method validate the UserName
	 *
	 * @param userName
	 * @return
	 */
	public static boolean isValidUser(User user) {
		boolean isValid = false;
			boolean username = StringValidation.isValidString(user.getUsername(), "Invalid User Name");
			boolean age = AgeValidation.isValidAge(user.getAge(), "Invalid User Age");
			boolean phoneNumber = PhoneNumberValidation.isValidMobileNumber(Long.toString(user.getPhoneNumber()),
					"Invalid Mobile Number");
			boolean gender = StringValidation.isValidGender(user.getGender(), "Invalid Gender");
			boolean email = EmailValidation.isValidEmail(user.getEmail(), "Invalid email format");
			boolean password = StringValidation.isValidString(user.getPassword(), "Invalid password");
			boolean address = StringValidation.isValidString(user.getAddress(), "Invalid Address");
			if (username && age && phoneNumber && gender && email && password && address) {
				isValid = true;
			} 
		return isValid;
	}
}

