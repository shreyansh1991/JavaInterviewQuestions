package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FutureDate {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String d1 = df.format(d);
		System.out.println(d1);
		c.add(c.DAY_OF_MONTH, 2);
		System.out.println(df.format(c.getTime()));

	}
}
