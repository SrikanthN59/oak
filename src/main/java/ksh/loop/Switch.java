package ksh.loop;

public class Switch {

	public static void main(String[] args) {
		System.out.println(daysInaWeek(2));
	} 
	
	public static String daysInaWeek(int day) {
		
		String dayString = null;

		switch (day) {
		case 1:
			dayString = "Monday";
			break;

		case 2:
			dayString = "Tuesday";
			break;

		case 3:
			dayString = "Wednesday";
			break;

		case 4:
			dayString = "thursday";
			break;

		case 5:
			dayString = "Friday";
			break;

		case 6:
			dayString = "Saturday";
			break;

		case 7:
			dayString = "Sunday";
			break;

		case 8:
			dayString = "Invalid_day";
			break;
		}
		return dayString;
	}
}
