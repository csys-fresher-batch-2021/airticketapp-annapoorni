package in.poorni.services;

import java.util.List;

import in.poorni.Model.Flight;
import in.poorni.Util.StringValidation;
import in.poorni.Validation.FlightValidation;
import in.poorni.dao.FlightDao;

public class FlightService {
	 FlightDao flightDao = new FlightDao();
	/**
	 * This method is used to get the list of flights
	 * 
	 * @return
	 */
	public List<Flight> getFlights() {
		return flightDao.findAllFlight();
	}
	public boolean addFlight(Flight flight) {
		boolean isAdded = false;
		if (FlightValidation.isValidFlight(flight)) {
			flightDao.save(flight);
			isAdded = true;
		}
		return isAdded;
	}
	
	public Flight searchFlight(String searchFlight) {
		return flightDao.search(searchFlight);

		
	}
	public boolean updateFlight(Flight flight) {
		boolean isUpdated = false;
		if (FlightValidation.isValidFlight(flight)) {
			flightDao.update(flight);
			isUpdated=true;
		}
		return isUpdated;
	}
	public boolean deleteFlight(String flightId) {
		boolean isDelete = false;
		if (StringValidation.isValidString(flightId,"Invalid flightId")){
			flightDao.delete(flightId);
			isDelete=true;
		}
		return isDelete;
	}

}