

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import in.airlineapp.FlightAvailability;
import in.poorni.airlineapp.Flight;
import in.poorni.airlineapp.FlightDetails;

public class FlightAvailabilityValidation {

	/*
	 * To validate whether the flightname is given correctly.
	 */
	@Test
	public void flightNameValidation1() {
		boolean valid = FlightAvailability.searchFlightName("IndiGo");
		assertTrue(valid);

	}
	/*
	 * Displaying available flight details.
	 */

	@Test
	public void displayFlightName() {
		FlightAvailability.displayFlightName();

	}
		}