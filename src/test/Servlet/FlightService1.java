package in.poorni.Servlet;
import java.util.ArrayList;
import java.util.List;

import in.poorni.airlineapp.Flight;
import in.poorni.airlineapp.Product;

public class FlightService {
	private FlightService() {
		//private constructor to avoid object creation
	}
	private static final List<Flight>  flights = new ArrayList<Flight>();
	/**
	 * method to display the products available
	 * 
	 * @return
	 * 
	 */
	public static List<Flight> getFlight() {
		return flights;
	}
	public static  List<Flight> addFlight(String flightName) {
		//TODO: call validation and check productName
	//	if(products.containsValue(productName)) {
		//	throw new RuntimeException("Product Name already exists");
		//}
		System.out.println("Successfully added " + flightName);
		flights.add(new Flight(flightName));
		return flights;
	}
}
