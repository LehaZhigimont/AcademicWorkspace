package examples19.dutascructure.list;

import java.util.LinkedList;

public class TestClassMain {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList spisok = new LinkedList();
		spisok.add(12);
		spisok.add(11);
		spisok.add(12323);
		spisok.add(107);
		spisok.add(12321);
		spisok.addFirst(00000);
		System.out.println(spisok);

		/*
		 * ListOfInteger spisok = new ListOfInteger(); spisok.printList();
		 * spisok.insertBefore(10, 0); spisok.printList();
		 * spisok.insertBefore(11, 0); spisok.insertBefore(12, 0);
		 * spisok.printList(); spisok.insertBefore(12, 3); spisok.printList();
		 * spisok.insertBefore(12, 4); spisok.printList();
		 * spisok.insertBefore(120, 8); spisok.printList();
		 */

	}
}
