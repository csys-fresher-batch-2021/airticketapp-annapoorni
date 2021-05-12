package in.airlineapp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FlightAvailability {

	static ArrayList<String> flightName = new ArrayList<String>();

	static {
		System.out.println("********Select your flight name********");

		flightName.add("IndiGo");
		flightName.add("AirIndia");
		flightName.add("SpiceJet");

	}

	public static boolean searchFlightName(String name) {
		boolean validFlightName = false;
		if (flightName.contains(name)) {
			validFlightName = true;
		}
		return validFlightName;
	}

	public static void displayFlightName() {
		for (String nameflight : flightName) {
			System.out.println(nameflight);
		}
	}

}