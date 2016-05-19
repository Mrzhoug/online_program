package stack;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8:00"));
		java.text.SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd kk:mm:ss SSS");
		System.out.println(sdf.format(cal1.getTime()));
		for (int i = 0; i < 100; i++) {
			float f = 999999.9f;
			do {
				f = f - 1.0000001f;
			} while (f > 0.0f);
		}
		cal1 = Calendar.getInstance();
		System.out.println(sdf.format(cal1.getTime()));
	}
}
