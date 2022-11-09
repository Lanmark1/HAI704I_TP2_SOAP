package hotelreservation;

import java.time.LocalDate;

public class Creneau {

	LocalDate firstDate;
	LocalDate secondDate;
	
	
	public Creneau() {
		this.firstDate =  LocalDate.parse("2000-01-01");
		this.secondDate =  LocalDate.parse("2000-01-01");
	}
	
	public Creneau(LocalDate firstDate, LocalDate secondDate) {
		this.firstDate = firstDate;
		this.secondDate = secondDate;
	}
	
	public LocalDate getfirstDate() {
		return firstDate;
	}
	
	public LocalDate getsecondDate() {
		return secondDate;
	}
	
	
}
