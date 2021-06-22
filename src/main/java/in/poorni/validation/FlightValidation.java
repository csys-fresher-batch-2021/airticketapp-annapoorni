package in.poorni.validation;

import in.poorni.model.Flight;
import in.poorni.util.IntegerValidation;
import in.poorni.util.StringValidation;

public class FlightValidation {

	private FlightValidation() {
		// Default Constructor
	}

	public static boolean isValidFlight(Flight flight) {
		boolean isValid = false;
		try {
			boolean FlightId = StringValidation.isValidString(flight.getFlightId(), "Invalid Flight Id");
			boolean Airlines = StringValidation.isValidString(flight.getAirlines(), "Invalid Flight Name");
			boolean departingfrom = StringValidation.isValidString(flight.getDepartingFrom(),
					"Invalid Departing from Id");
			boolean departingTo = StringValidation.isValidString(flight.getDepartingTo(), "Invalid Departing to Id");
			boolean firstClass = IntegerValidation.isIntValid(flight.getFirstClass(), "Invalid first class Id");
			boolean economyClass = IntegerValidation.isIntValid(flight.getEconomyClass(), "Invalid economy class Id");
			boolean businessClass = IntegerValidation.isIntValid(flight.getBusinessClass(), "Invalid business class Id");

			if (FlightId && Airlines && departingfrom && departingTo && firstClass && economyClass && businessClass) {
				isValid = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return isValid;
	}
}