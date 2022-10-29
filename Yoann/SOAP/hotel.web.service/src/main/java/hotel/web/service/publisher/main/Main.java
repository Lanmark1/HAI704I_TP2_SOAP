package hotel.web.service.publisher.main;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {
	
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(df.parse("10-10-2022").before( df.parse("11-10-2022")));
//		Date d1 = new Date(, 0, 0);
	}

}
