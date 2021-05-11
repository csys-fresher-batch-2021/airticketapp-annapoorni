package in.poorni.airlineapp;

public class Source {
public String fromWhere;
	
	public Source(String name) {
		this.fromWhere = name;
	}
	
	@Override
	public String toString() {
		return "Flight [flightDetails=" + fromWhere + "]";
	}


}
