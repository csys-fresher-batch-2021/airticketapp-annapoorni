package in.airlineapp;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import in.poorni.airlineapp.Flight;
import in.poorni.airlineapp.flightDetails;

public class FlightAvailabilityValidation {

	@Test
	public void flightNameValidation() {
		FlightAvailability.flightNameTest();

	}

	/*
	 * To validate whether the flightname is given correctly.
	 */
	@Test
	public void flightNameValidation1() {
		boolean valid = FlightAvailability.searchFlightName("IndiGo");
		assertTrue(valid);

	}

	@Test
	public void flightNameValidation2() {
		boolean valid = FlightAvailability.searchFlightName("SpiceJet");
		assertTrue(valid);

	}

	@Test
	public void flightNameValidation3() {
		boolean valid = FlightAvailability.searchFlightName("Alliance Air");
		assertFalse(valid);

	}
	/*
	 * Displaying available flight details.
	 */

	@Test
	public void displayFlightName() {
		FlightAvailability.displayFlightName();

	}
	@Test
	public void displayFlightName2() {
		FlightAvailability.displayFlightName();

	}public void testDispaly() {
		ArrayList<Flight> typesOfFlight=FlightAvailability.getNumberOfFlight();
		assertEquals(5,typesOfFlight.size());

	}
}