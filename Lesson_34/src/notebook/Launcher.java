package notebook;

import java.util.Scanner;

/**
 * Launcher<br>
 * Conroler-View for Notebook
 * 
 * @author Ilya Zhukov
 */
public class Launcher {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.start();
		System.out.println(menu);
	}

}