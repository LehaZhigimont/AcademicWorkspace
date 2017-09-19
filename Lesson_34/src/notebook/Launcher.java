package notebook;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		Notebook  nb = new Notebook();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Welcom Notepad. What do you want to do?");
			System.out.println("\t1.Work for notes\n\t2.Work for remainders\n\t3.Exit");
			String choise;
			choise = sc.nextLine();
			switch (choise) {
			case ("1"):
				nb = menuNotes(nb);
				break;
			case ("2"):
				nb = menuRemainders(nb);
				break;
			case ("3"):
				return;
			default:
				break;
			}

		}

	}

	private static Notebook menuNotes(Notebook  nb) {
		Scanner scNotes = new Scanner(System.in);
		String choiseNotes;

		while (true) {
			System.out.println("What do you want to do for notes?");
			System.out.println("\t1.Add notes\n\t2.Show notes\n\t3.Exit on top menu");
			choiseNotes = scNotes.nextLine();
			switch (choiseNotes) {
			case ("1"):
				nb.addNote();
				break;
			case ("2"):
				nb.showNotes();
				break;
			case ("3"):
				return nb;
			default:
				break;
			}

		}

	}

	private static Notebook menuRemainders(Notebook  nb) {
		Scanner scRemainders = new Scanner(System.in);
		String choiseRemainders;
		
		while (true) {
			System.out.println("What do you want to do for remainders?");
			System.out.println("\t1.Add remainders\n\t2.Show remainders\n\t3.Exit on top menu");
			choiseRemainders = scRemainders.nextLine();
			switch (choiseRemainders) {
			case ("1"):
				nb.addRemainder();
				break;
			case ("2"):
				nb.showRemainder();
				break;
			case ("3"):
				return nb;
			default:
				break;
			}

		}

	}

}
