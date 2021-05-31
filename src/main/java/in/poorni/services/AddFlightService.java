package in.poorni.services;

import java.sql.SQLException;

import in.poorni.Model.AddFlightModel;
import in.poorni.dao.DisplayDao;

public class AddFlightService {
			
		public static boolean addFlight(AddFlightModel loans) throws ClassNotFoundException, SQLException {
			DisplayDao.addFlight(loans);
			return true;
			
			
		}

	
		
	}
