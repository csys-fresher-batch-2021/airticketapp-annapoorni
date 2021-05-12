package in.poorni.airlineapp;
import java.util.ArrayList;
import java.util.List;

public class FlightDetails {
	private static ArrayList<Flight> ListOfFlightDetails = new ArrayList<Flight>();

	static {
		Flight flightName1 = new Flight("Indigo");
		Flight flightName2 = new Flight("Air India");
		Flight flightName3 = new Flight("SpiceJet");

		Flight flightName4 = new Flight("AirAsia india");

		Flight flightName5 = new Flight("Vistara");


		
		ListOfFlightDetails.add(flightName1);
		ListOfFlightDetails.add(flightName2);
		ListOfFlightDetails.add(flightName3);

		ListOfFlightDetails.add(flightName4);

		ListOfFlightDetails.add(flightName5);


		
	}
	
		
	public static ArrayList<Flight> getNumberOfFlight(){
		return ListOfFlightDetails;
	}
	private FlightDetails() {
		
	}
	

}
