package agence.web.service.main;

import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
	
		Date date = new Date();
	    GregorianCalendar calendar = new GregorianCalendar();

        calendar.setTime(date);
        System.out.println(calendar.getTime());
		
	}

}
