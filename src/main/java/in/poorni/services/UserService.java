package in.poorni.services;

import in.poorni.model.User;
import in.poorni.util.StringValidation;
import in.poorni.validation.UserValidation;
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

