package in.poorni.services;

import java.util.List;

import in.poorni.Model.Seat;
import in.poorni.dao.SeatDao;

public class SeatService {

	SeatDao seatDao = new SeatDao();
	
	public List<Seat> getSeat() {
		return seatDao.getSeatDetails();
	}

}
