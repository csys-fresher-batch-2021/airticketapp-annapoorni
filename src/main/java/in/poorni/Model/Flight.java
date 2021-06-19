package in.poorni.Model;

import java.time.LocalTime;

public class Flight {
	
	public String getFlightId() {
		return flightId;
	}
	public Flight(String flightId, String airlines, LocalTime departureTime, String departingFrom, String departingTo,
			int firstClass, int economyClass, int businessClass) {
		super();
		this.flightId = flightId;
		this.airlines = airlines;
		this.departureTime = departureTime;
		this.departingFrom = departingFrom;
		this.departingTo = departingTo;
		this.firstClass = firstClass;
		this.economyClass = economyClass;
		this.businessClass = businessClass;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	public String getDepartingFrom() {
		return departingFrom;
	}
	public void setDepartingFrom(String departingFrom) {
		this.departingFrom = departingFrom;
	}
	public String getDepartingTo() {
		return departingTo;
	}
	public void setDepartingTo(String departingTo) {
		this.departingTo = departingTo;
	}
	public int getFirstClass() {
		return firstClass;
	}
	public void setFirstClass(int firstClass) {
		this.firstClass = firstClass;
	}
	public int getEconomyClass() {
		return economyClass;
	}
	public void setEconomyClass(int economyClass) {
		this.economyClass = economyClass;
	}
	public int getBusinessClass() {
		return businessClass;
	}
	public void setBusinessClass(int businessClass) {
		this.businessClass = businessClass;
	}
	
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlines=" + airlines + ", departureTime=" + departureTime
				+ ", departingFrom=" + departingFrom + ", departingTo=" + departingTo + ", firstClass=" + firstClass
				+ ", economyClass=" + economyClass + ", businessClass=" + businessClass + "]";
	}
	
	private String flightId;
	private String airlines;
	private LocalTime  departureTime;
	private String departingFrom;
	private String  departingTo;
	private int firstClass;
	private int economyClass;
	private int businessClass;
	
}
