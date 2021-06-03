package in.poorni.services;

import in.poorni.Model.RegisterModel;
import in.poorni.Validation.RegisterValidation;
import in.poorni.dao.RegisterDao;

public class RegisterService {
	private RegisterService() {

	}

	public static boolean register2(RegisterModel regobj) {
		try {
			RegisterDao.register1(regobj);


		} catch (Exception e) {

			e.printStackTrace();
		}
		return true;
	}
	public static boolean isValidUserDetails(String name,String password,String email,String age,String mobileNo,String adhaarNo,String pincode) {
		RegisterValidation.isValidAdhaarNo(name);
		RegisterValidation.isValidPassword(password);

		RegisterValidation.isValidEmail(email);
		RegisterValidation.isValidAge(age);
		RegisterValidation.isValidAdhaarNo(adhaarNo);
		RegisterValidation.isValidMobileno(mobileNo);
		RegisterValidation.isValidPincode(pincode);
		return true;

	}


}
