package in.poorni.Validation;

public class UserdetailSetValidation {
	private UserdetailSetValidation() {
		
	}
	
		public static boolean isEmptyString(String userName) {
			boolean isValid=false;
			
			if(!(userName.trim().equals(""))) {
				isValid=true;
				
			}
			return isValid;
		}
		
	
		
		
	}