package in.poorni.Model;

public class Seat {

	private String coach;

	private int seat;

	public Seat(String coach, int seat) {
		super();
		this.coach = coach;
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}
}
