package notebook;

import java.util.Date;
import java.util.Scanner;

/**
 * Element Notebook
 * 
 * @see Notebook
 * @author Ilya Zhukov
 */
public class Note {
	private static long countID = 5000;
	private long id;
	private Date date;//TODO
	private String dateString;
	private String text;

	public Note() {
		countID++;
		System.out.println("Enter text:\n");
		writeNote();
		date = new Date();
		Date dNote = new Date();
		this.dateString = "" + (dNote.getYear()+1900) + "." + (dNote.getMonth()+1) + "." + dNote.getDay() + " "
				+ (dNote.getHours()+1) + ":" + dNote.getMinutes() + "\t";
		dNote = null;
		this.id = countID;
	}

	public void writeNote() {
		Scanner scInputNode = new Scanner(System.in);
		this.text = scInputNode.nextLine();
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

	public String getText() {
		return text;
	}

	
}
