package notebook;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Model Notebook
 * 
 * @author Ilya Zhukov
 */
public class Notebook {
	private LinkedList<Reminder> listReminder;
	private LinkedList<Note> listNote;
	Scanner scNB = new Scanner(System.in);

	public Notebook() {

		listNote = new LinkedList<Note>();
		listReminder = new LinkedList<Reminder>();

	}

	public void addNote() {
		Note newNode = new Note();
		listNote.addLast(newNode);
	}

	public void addReminder() {
		Reminder newNode = new Reminder();
		listReminder.addLast(newNode);
	}

	public String showNotes() {
		String string = "";
		for (int i = 0; i < listNote.size(); i++) {
			string = string + "ID:" + listNote.get(i).getId() + "\tDate create: " + listNote.get(i).getDateString()
					+ "\nText:\n" + listNote.get(i).getText() + "\n\n";
		}
		return "\n\n\n********Notes*********\n\n" + string + "\n***********************\n";
	}

	public String showReminder() {
		String string = "";
		for (int i = 0; i < listReminder.size(); i++) {
			string = string + "ID:" + listReminder.get(i).getId() + "\tDate create: "
					+ listReminder.get(i).getDateString() + "\tDateReamaider: " + listReminder.get(i).getDateReminder()
					+ "\nRemaider:\n" + listReminder.get(i).getReminder() + "\n\n";
		}
		return "\n\n\n*******Reamaiders******\n\n" + string + "\n***********************\n";
	}

	public void showNote(long id) {
		String string = "";
		for (int i = 0; i < listNote.size(); i++) {
			if (listNote.get(i).getId() != id) {
				continue;
			} else {
				string = string + "ID:" + listNote.get(i).getId() + "\tDate create: " + listNote.get(i).getDateString()
						+ "\nText:\n" + listNote.get(i).getText() + "\n\n";
			}
			System.out.println(string);
		}
	}

	public void showRemainder(long id) {
		String string = "";
		for (int i = 0; i < listReminder.size(); i++) {
			if (listReminder.get(i).getId() != id) {
				continue;
			} else {
				string = string + "ID:" + listReminder.get(i).getId() + "\tDate create: "
						+ listReminder.get(i).getDateString() + "\tDateReamaider: "
						+ listReminder.get(i).getDateReminder() + "\nRemaider:\n" + listReminder.get(i).getReminder()
						+ "\n\n";
				System.out.println(string);
			}
		}
	}

	public void removeNote(long id) {

		for (int i = 0; i < listNote.size(); i++) {
			if (listNote.get(i).getId() != id) {
				continue;
			} else {
				System.out.println("Note: " + listNote.get(i).getId() + " was removed");
				listNote.remove(i);
			}
		}
	}

	public void removeReminder(long id) {

		for (int i = 0; i < listReminder.size(); i++) {
			if (listNote.get(i).getId() != id) {
				continue;
			} else {
				System.out.println("Reminder: " + listReminder.get(i).getId() + " was removed");
				listReminder.remove(i);
			}
		}
	}

	public void overwriteNote(long id) {
		for (int i = 0; i < listNote.size(); i++) {
			if (listNote.get(i).getId() != id) {
				continue;
			} else {
				System.out.println("Note: " + listNote.get(i).getId() + " ready to overwrite\n\n");
				listNote.get(i).writeNote();
			}
		}
	}

	public void overwriteReminder(long id) {
		for (int i = 0; i < listReminder.size(); i++) {
			if (listReminder.get(i).getId() != id) {
				continue;
			} else {
				System.out.println("Reminder: " + listReminder.get(i).getId() + " ready to overwrite\n\n");
				listReminder.get(i).writeReminder();
				System.out.println("Do you want to change the reminder date? (y/n)");

				while (true) {
					String answer = scNB.nextLine();
					switch (answer) {
					case "y":
						listReminder.get(i).writeDateReminder();
						break;
					case "n":
						return;
					default:
						break;
					}
				}
			}
		}
	}

	public void showAll() {
		// TODO
		String dateBegin, dateEnd;
		dateBegin = scNB.nextLine();
		dateEnd = scNB.nextLine();

	}

	public static String dateControl(String dateString) {
		// TODO
		return dateString;
	}
	
	private static String parsingDate(Date date){
		String dateString = "0000.00.00 00:00";
		//TODO
		return dateString;
	}

}
