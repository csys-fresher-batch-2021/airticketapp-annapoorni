package in.poorni.services;

import java.util.ArrayList;

import in.poorni.Model.AddFlightTime;


public class FlightTime {
	private static ArrayList<AddFlightTime> ListOfFlightDetails = new ArrayList<>();

	static {
		
		AddFlightTime Time1=new AddFlightTime("7:30 am");
		AddFlightTime Time2=new AddFlightTime("7:30 am");

		AddFlightTime Time3=new AddFlightTime("1:30 pm");

		AddFlightTime Time4=new AddFlightTime("4:30 pm");

		AddFlightTime Time5=new AddFlightTime("8:30 pm");



		
		ListOfFlightDetails.add(Time1);
		ListOfFlightDetails.add(Time2);
		ListOfFlightDetails.add(Time3);

		ListOfFlightDetails.add(Time4);

		ListOfFlightDetails.add(Time5);


		
	}
	
		
	public static ArrayList<AddFlightTime> getFlightTiming(){
		return ListOfFlightDetails;
	}
	private FlightTime() {
		
	}


}
