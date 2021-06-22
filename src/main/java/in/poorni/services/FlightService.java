package in.poorni.services;

import java.util.List;

import in.poorni.model.Flight;
import in.poorni.util.StringValidation;
import in.poorni.validation.FlightValidation;
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
	
	public List<Flight> searchFlight(String sourceName, String destinationName) {
		String sourcePlace = sourceName;
		String destinationPlace = destinationName;
		FlightDao flightDao = new FlightDao();
		return flightDao.searchBySourceAndDestinationName(sourcePlace, destinationPlace);
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
