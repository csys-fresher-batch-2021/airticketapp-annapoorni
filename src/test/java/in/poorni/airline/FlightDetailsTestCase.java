package in.poorni.airline;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import in.poorni.airlineapp.Flight;
import in.poorni.airlineapp.FlightDetails;

public class FlightDetailsTestCase {

	@Test
	public void testDispaly() {
		List<Flight> typesOfFlight=FlightDetails.getNumberOfFlight();
		assertEquals(5,typesOfFlight.size());
	}
}
