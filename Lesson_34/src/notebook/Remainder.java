package notebook;

import java.util.Date;
import java.util.Scanner;

public class Remainder {
	private static long count=(long)((Math.random())*10000);
	private long id;
	private String date;
	private String text;
	private String dateRemainder;
	
	public Remainder(){
		count++;
		writeRemainders();
		writeDateRemainders();
		Date dRemainder = new Date();
		//FIXME
		this.date = "" + dRemainder.getYear() + "." +dRemainder.getMonth() + "." + dRemainder.getDay() + " " + dRemainder.getHours() + ":" + dRemainder.getMinutes()+"\t";

		this.id = count;
	}
	
	
	private void writeDateRemainders() {
		Scanner scInputDateRemainders = new Scanner(System.in);
		this.dateRemainder = scInputDateRemainders.nextLine();
		
	}


	public void writeRemainders(){
		Scanner scInputRemainders = new Scanner(System.in);
		this.text = scInputRemainders.nextLine();
	}
	
	
}
