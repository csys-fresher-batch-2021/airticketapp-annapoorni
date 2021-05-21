package in.poorni.airlineapp;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FlightService {
	private FlightService() {
		//private constructor to avoid object creation
	}
	private static final List<String> flights = new ArrayList<>();
	static {
		// List of products in the map
		flights.add(1, "IndoGo");
		flights.add(2, "SpiceJet");
		}
	/**
	 * method to display the products available
	 * 
	 * @return
	 * 
	 */
	public static List<Flight> getFlights() {
		return getFlights();
	}
	public static List addFlight(Object flightName) {
		//TODO: call validation and check productName
		System.out.println("Successfully added " + flightName);
		flights.add((String) flightName);
		return flights;
	}
	}