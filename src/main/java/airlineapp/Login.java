package in.poorni.airlineapp;

public class Login {
	private Login() {
		
	}
	public static boolean isEmptyString(String username) {
		boolean valid=false;
		if(!(username.trim().equals(""))) {
			valid=true;
		}
		return valid;
	}

}
