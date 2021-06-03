package in.poorni.services;

import java.sql.SQLException;

import in.poorni.Model.AddFlightModel;
import in.poorni.dao.DisplayDao;

public class AddFlightService {
			
		public static boolean addFlight(AddFlightModel flight) throws ClassNotFoundException, SQLException {
			DisplayDao.addFlight(flight);
			return true;
			
			
		}
		public static boolean adddFlightTime(AddFlightModel time) throws ClassNotFoundException, SQLException {
			DisplayDao.addFlight(time);
			return true;
			
			
		}



	
		
	}
