package notebook;

import java.util.LinkedList;
import java.util.Scanner;

public class Notebook {
	private LinkedList listRemainder;
	private LinkedList listNote;

	public Notebook() {
		listNote = new LinkedList();
		listRemainder = new LinkedList();
	}

	public void addNote() {
		Note newNode = new Note();
		listNote.add(newNode);
	}

	public void addRemainder() {
		Remainder newNode = new Remainder();
		listRemainder.add(newNode);
	}

	public void showNotes() {
		Scanner scShowNotes = new Scanner(System.in);
		String choiseShowNotes;

		// TODO
		System.out.println(listNote);
		while (true) {
			System.out.println("\n\n\nMENU NOTES");
			System.out.println("\t1.Add notes\n\t2.Edit note\n\t3.Remove note\n\t4.Exit on top menu\n\n\n");
			long id;
			choiseShowNotes = scShowNotes.nextLine();
			switch (choiseShowNotes) {
			case ("1"):
				addNote();
				break;
			case ("2"):
				id = scShowNotes.nextLong();
				editNote(id);
				break;
			case ("3"):
				id = scShowNotes.nextLong();
				removeNote(id);
				break;
			case ("4"):
				return;
			default:
				break;
			}
		}
	}

	public void showRemainder() {
		while (true) {
			Scanner scShowRemainder = new Scanner(System.in);
			String choiseShowRemainder;

			// TODO
			System.out.println(listRemainder);
			System.out.println("\n\n\nMENU REMAINDER");
			System.out
					.println("\t1.Add remainder\n\t2.Edit remainder\n\t3.Remove remainder\n\t4.Exit on top menu\n\n\n");
			long id;
			choiseShowRemainder = scShowRemainder.nextLine();
			switch (choiseShowRemainder) {
			case ("1"):
				addNote();
				break;
			case ("2"):
				id = scShowRemainder.nextLong();
				editNote(id);
				break;
			case ("3"):
				id = scShowRemainder.nextLong();
				removeNote(id);
				break;
			case ("4"):
				return;
			default:
				break;
			}
		}
	}

	/*
	 * public void showNotes(long id) { // TODO }
	 * 
	 * public void showRemainder(long id) { // TODO }
	 */

	public void removeNote(long id) {
		// TODO
	}

	public void removeRemainder(long id) {
		// TODO
	}

	private void editNote(long id) {
		// TODO
	}

}
