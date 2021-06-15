package in.poorni.Model;

public class AddFlightModel {
		public String addFlight;
		public String getAddaFlightTime() {
			return adddFlightTime;
		}
		public void setAdddFlightTime(String adddFlightTime) {
			this.adddFlightTime = adddFlightTime;
		}
		private String adddFlightTime;
		public AddFlightModel(String addFlight, String adddFlightTime) {
			super();
			this.addFlight = addFlight;
			this.adddFlightTime=adddFlightTime;
		}
		public String AddFlightModel(String addFlight, String adddFlightTime) {
			// TODO Auto-generated constructor stub
			return addFlight;
			
		}
		public String getFlight() {
			return addFlight;
		}
		public void setFlight(String addFlight) {
			this.addFlight = addFlight;
		}
		@Override
		public String toString() {
			return "AddFlightModel [addFlight=" + addFlight + ", adddFlightTime=" + adddFlightTime + "]";
		}
		
	}
