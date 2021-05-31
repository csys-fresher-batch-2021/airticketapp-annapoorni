package airlineapp;

public class Flight {
	public String flightnames;
	
	public Flight(String availabilities) {
		this.flightnames = availabilities;
	}
	
	@Override
	public String toString() {
		return "Flight [flightDetails=" + flightnames + "]";
	}
}
