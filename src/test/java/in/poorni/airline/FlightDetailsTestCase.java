package in.poorni.airline;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import in.poorni.airlineapp.Flight;
import in.poorni.airlineapp.flightDetails;

public class FlightDetailsTestCase {

	@Test
	public void testDispaly() {
		ArrayList<Flight> typesOfFlight=flightDetails.getNumberOfFlight();
		assertEquals(5,typesOfFlight.size());
	}
}
