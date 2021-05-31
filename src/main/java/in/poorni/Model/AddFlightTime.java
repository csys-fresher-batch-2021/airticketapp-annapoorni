package in.poorni.Model;

public class AddFlightTime {
	private String addTime;
	public AddFlightTime(String addTime) {
		super();
		this.addTime = addTime;
	}
	public String getTime() {
		return addTime;
	}
	public void setFlight(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "addTime [addTime=" + addTime + "]";
	}
	
}