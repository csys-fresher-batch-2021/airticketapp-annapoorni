package in.poorni.services;
import java.util.ArrayList;

import in.poorni.Model.AddFlightModel;


public class FlightDetails {
	private static ArrayList<AddFlightModel> ListOfFlightDetails = new ArrayList<>();

	static {
		
		 AddFlightModel Flight1=new AddFlightModel("IndiGo","7:30 am");
		 AddFlightModel Flight2=new AddFlightModel("AirIndia","10:30 am");

		 AddFlightModel Flight3=new AddFlightModel("SriLanka Airlines","1:30 pm");

		 AddFlightModel Flight4=new AddFlightModel("Fly emirates","4:30 pm");

		 AddFlightModel Flight5=new AddFlightModel("Air Asia","8:30 pm");



		
		ListOfFlightDetails.add(Flight1);
		ListOfFlightDetails.add(Flight2);
		ListOfFlightDetails.add(Flight3);

		ListOfFlightDetails.add(Flight4);

		ListOfFlightDetails.add(Flight5);


		
	}
	
		
	public static ArrayList<AddFlightModel> getNumberOfFlight(){
		return ListOfFlightDetails;
	}
	private FlightDetails() {
		
	}
	

}
