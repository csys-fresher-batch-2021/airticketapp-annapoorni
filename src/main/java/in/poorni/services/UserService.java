package in.poorni.services;

import in.poorni.Model.User;
import in.poorni.Util.StringValidation;
import in.poorni.Validation.UserValidation;
import in.poorni.dao.RegisterDao;

public class UserService {
			RegisterDao registerDao=new RegisterDao();
		/**
		 * This method is used to add medicine
		 * 
		 * @param medicine
		 * @return
		 */
		public boolean addUser(User user) {
			boolean isAdded = false;
			if (UserValidation.isValidUser(user)) {
				registerDao.save(user);
				isAdded = true;
			}
			return isAdded;
		}
		public boolean checkUser(String username, String password) {
			boolean isChecked = false;
			if (StringValidation.isValidString(username, password) && registerDao.findUser(username, password)) {
					isChecked = true;
			}
			return isChecked;
		}
	}

