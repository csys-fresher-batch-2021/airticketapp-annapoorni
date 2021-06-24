package in.poorni.airlineapp;

import java.util.ArrayList;
import java.util.List;


public class AddFlight {
	
	private AddFlight() {
		//private constructor to avoid object creation
	}
	public static final List<Flight> flights = new ArrayList<>();
	/**
	 * method to display the products available
	 * 
	 * @return
	 * 
	 */
	public static List<Flight> getFlights() {
		return flights;
	}
	public static boolean  addFlight(Flight flightName) {
		//TODO: call validation and check productName
		boolean valid=false;
		if(flightName!=null) {
		flights.add(flightName);
		valid=true;
		}
		return valid;
	}
}

