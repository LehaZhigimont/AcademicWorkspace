package notebook;

import java.util.Scanner;

/**
 * Conroler-View for Notebook
 * 
 * @author Ilya Zhukov
 */
public class Menu {
	private static int digit = 100;
	private Notebook nb;
	private Scanner sc;
	private String idMenu;

	public Menu() {
		this.nb = new Notebook();
		this.sc = new Scanner(System.in);
		this.idMenu = "" + digit;
		digit++;
	}

	public void start() {
		System.out.print("Welcom Notepad. ");
		while (true) {
			System.out.println("What do you want to do?");
			System.out.println("\t1.Work for notes\n\t2.Work for remainders\n\t3.Exit");
			String choise=sc.nextLine();
			switch (choise) {
			case ("1"):
				nb = menuNotes(nb);
				break;
			case ("2"):
				nb = menuRemainders(nb);
				break;
			case ("4"):
				
				nb.showAll();
				break;
			case ("3"):
				nb = null;
				return;
			default:
				break;
			}

		}
	}

	private static Notebook menuNotes(Notebook nb) {
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
				mShowNotes(nb);
				break;
			case ("3"):
				return nb;
			default:
				break;
			}

		}

	}

	private static Notebook menuRemainders(Notebook nb) {
		Scanner scRemainders = new Scanner(System.in);
		String choiseRemainders;

		while (true) {
			System.out.println("What do you want to do for remainders?");
			System.out.println("\t1.Add remainders\n\t2.Show remainders\n\t3.Exit on top menu");
			choiseRemainders = scRemainders.nextLine();
			switch (choiseRemainders) {
			case ("1"):
				nb.addReminder();
				break;
			case ("2"):
				mShowRemainder(nb);
				break;
			case ("3"):
				return nb;
			default:
				break;
			}

		}

	}

	private static Notebook mShowNotes(Notebook nb) {
		Scanner scMenuShowNotes = new Scanner(System.in);
		String choiseMenuShowNotes;

		System.out.println(nb.showNotes());
		while (true) {
			System.out.println("\n-=MENU NOTES=-");
			System.out.println(
					"\t1.Add notes\n\t2.Overwrite note\n\t3.Remove note\n\t4.Show notes\n\t5.Exit on top menu\n\n\n");
			long id;
			choiseMenuShowNotes = scMenuShowNotes.nextLine();
			switch (choiseMenuShowNotes) {
			case ("1"):
				nb.addNote();
				break;
			case ("2"):
				System.out.println("\nEnter ID of note for overwrite(cansel -1)\n");
				try {
					id = scMenuShowNotes.nextLong();
				} catch (Exception e) {
					id = 1;
				}
				if (id != -1) {
					nb.overwriteNote(id);
				} else {
					System.out.println("Cansel or invalid enter");
				}
				break;
			case ("3"):
				System.out.println("\nEnter ID of note for remove(cansel -1)\n");
				try {
					id = scMenuShowNotes.nextLong();
				} catch (Exception e) {
					id = -1;
				}
				if (id != -1) {
					nb.removeNote(id);
				} else {
					System.out.println("Cansel or invalid enter");
				}
				break;
			case ("4"):
				System.out.println(nb.showNotes());
				break;
			case ("5"):
				return nb;
			default:
				break;
			}
		}

	}

	private static Notebook mShowRemainder(Notebook nb) {
		Scanner scMenuShowReminder = new Scanner(System.in);
		String choiseShowReminder;

		System.out.println(nb.showReminder());
		while (true) {
			System.out.println("\n-=MENU REMAINDER=-");
			System.out.println(
					"\t1.Add remainder\n\t2.Overwrite remainder\n\t3.Remove remainder\n\t4.Show remainders\n\t5.Exit on top menu\n\n\n");
			long id;
			choiseShowReminder = scMenuShowReminder.nextLine();
			switch (choiseShowReminder) {
			case ("1"):
				nb.addReminder();
				break;
			case ("2"):
				System.out.println("\nEnter ID of reminder for overwrite(cansel -1)\n");

				try {
					id = scMenuShowReminder.nextLong();
				} catch (Exception e) {
					id = -1;
				}
				if (id != -1) {
					nb.overwriteReminder(id);
				} else {
					System.out.println("Cansel or invalid enter");
				}
				break;
			case ("3"):
				System.out.println("\nEnter ID of remindern for remove(cansel -1)\n");

				try {
					id = scMenuShowReminder.nextLong();
				} catch (Exception e) {
					id = -1;
				}
				if (id != -1) {
					nb.removeReminder(id);
				} else {
					System.out.println("Cansel or invalid enter");
				}
				break;
			case ("4"):
				System.out.println(nb.showReminder());
				break;
			case ("5"):
				return nb;
			default:
				break;
			}
		}
	}

	@Override
	public String toString() {
		if (nb != null) {
			return "Notepad menu ID: " + this.idMenu + " Run";
		}
		return "Notepad menu ID: " + this.idMenu + " End";
	}

}
