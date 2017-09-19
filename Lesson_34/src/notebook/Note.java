package notebook;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Note {
	private static long count = (long) (((Math.random()) * 100)+100);
	private long id;
	private String date;
	private String text;

	public Note() {
		count++;
		writeNote();
		Date dNote = new Date();
		//FIXME
		this.date = "" + dNote.getYear() + "." + dNote.getMonth() + "." + dNote.getDay() + " " + dNote.getHours() + ":"
				+ dNote.getMinutes() + "\t";
		this.id = count;
	}

	public void writeNote() {
		Scanner scInputNode = new Scanner(System.in);
		this.text = scInputNode.nextLine();
	}

}
