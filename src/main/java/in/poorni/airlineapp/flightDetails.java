package in.poorni.airlineapp;
import java.util.ArrayList;

public class flightDetails {
	private static ArrayList<Flight> ListOfFlightDetailsList = new ArrayList<Flight>();
	private static ArrayList<Source> ListOfSourceDetailsList = new ArrayList<Source>();

	static {
		Flight flightName1 = new Flight("IndiGo");
		Flight flightName2 = new Flight("AirAsia India");
		Flight flightName3 = new Flight("Spicejet");
		Flight flightName4 = new Flight("GoAir");
		Flight flightName5 = new Flight("Vistara");

		ListOfFlightDetailsList.add(flightName1);
		ListOfFlightDetailsList.add(flightName2);

		ListOfFlightDetailsList.add(flightName3);

		ListOfFlightDetailsList.add(flightName4);

		ListOfFlightDetailsList.add(flightName5);

	}
	
	static {
		Source source1 = new Source("Coimbatore");
		Source source2 = new Source("Cochin");

		Source source3 = new Source("Mumbai");

		Source source4 = new Source("Banglore");

		Source source5 = new Source("Chennai");
		
		ListOfSourceDetailsList.add(source1);
		ListOfSourceDetailsList.add(source2);

		ListOfSourceDetailsList.add(source3);

		ListOfSourceDetailsList.add(source4);

		ListOfSourceDetailsList.add(source5);

		

	}
	
	public static ArrayList<Flight> getNumberOfFlight(){
		return ListOfFlightDetailsList;
	}
	public static ArrayList<Source> getSourceName(){
		return ListOfSourceDetailsList;
	}

}
