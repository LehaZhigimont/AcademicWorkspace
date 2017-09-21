package notebook;

import java.util.Date;
import java.util.Scanner;

/**
 * Element Notebook
 * 
 * @see Notebook
 * @author Ilya Zhukov
 */
public class Reminder {
	private static long countID = 1000;
	private long id;
	private Date date;// TODO
	private String dateString;
	private String reminder;
	private String dateReminder;

	public Reminder() {
		countID++;
		System.out.println("Enter reminder:\n");
		writeReminder();
		writeDateReminder();
		
		date = new Date();
		Date dRemainder = new Date();

		this.dateString = "" + (dRemainder.getYear() + 1900) + "." + (dRemainder.getMonth() + 1) + "."
				+ dRemainder.getDay() + " " + (dRemainder.getHours()) + ":" + dRemainder.getMinutes() + "\t";
		dRemainder = null;
		this.id = countID;
	}

	public void writeDateReminder() {
		System.out.println("Enter date reminder(yyyy.mm.dd hh:mm)\n");
		Scanner scInputDateReminder = new Scanner(System.in);

		while (true) {
			this.dateReminder = scInputDateReminder.nextLine();
			// проверка на коректные данные
			// return;
			if (dateReminder.length() == 16) {
				if (dateReminder.charAt(4) == '.' && dateReminder.charAt(7) == '.' && dateReminder.charAt(10) == ' '
						&& dateReminder.charAt(13) == ':') {
					return;
				}
			}
			System.out.println("Invalid input");
		}
	}

	public void writeReminder() {
		Scanner scInputReminders = new Scanner(System.in);
		this.reminder = scInputReminders.nextLine();
	}

	public static long getCount() {
		return countID;
	}

	public long getId() {
		return id;
	}

	public String getDateString() {
		return dateString;
	}

	public String getReminder() {
		return reminder;
	}

	public String getDateReminder() {
		return dateReminder;
	}

	public Date getDate() {
		return date;
	}

}
