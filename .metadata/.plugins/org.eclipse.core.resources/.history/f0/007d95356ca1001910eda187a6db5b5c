
public class Time {
	private int hour;
	private int minute;

	Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public static Time addTime(Time a, Time b) {
		int totalhours = 0;
		int totalminutes = 0;

		totalhours = a.hour + b.hour;
		totalminutes = a.minute + b.minute;

		while (totalminutes > 59) {
			totalminutes -= 60;
			totalhours++;
		}
		Time added = new Time(totalhours, totalminutes);
		return added;

	}

	public Time addTime(Time b) {
		int totalhours = 0;
		int totalminutes = 0;

		totalhours = this.hour + b.hour;
		totalminutes = this.minute + b.minute;

		while (totalminutes > 59) {
			totalminutes -= 60;
			totalhours++;
		}
		Time added = new Time(totalhours, totalminutes);
		return added;

	}

	public int getHours() {
		return this.hour;
	}

	public int getMin() {
		return this.minute;
	}

}
