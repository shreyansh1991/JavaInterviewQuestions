package other;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		String d1 = "13/07/17";

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date d2 = df.parse(d1);
		System.out.println(d2);
		DateFormat requiredDate = new SimpleDateFormat("dd/MMM/yy");
		String reqDate = requiredDate.format(d2);
		System.out.println(reqDate);
	}
}
