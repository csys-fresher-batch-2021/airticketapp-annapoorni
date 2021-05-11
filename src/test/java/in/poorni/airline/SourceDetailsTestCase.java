package in.poorni.airline;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import in.poorni.airlineapp.Source;
import in.poorni.airlineapp.flightDetails;


public class SourceDetailsTestCase {

	@Test
	public void testDispaly() {
		ArrayList typesOfSource=flightDetails.getSourceName();
		assertEquals(5,typesOfSource.size());
	}
}
