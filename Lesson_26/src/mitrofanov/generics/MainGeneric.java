package mitrofanov.generics;

import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import javafx.print.Collation;

@SuppressWarnings("unused")
public class MainGeneric {

	public static void main(String[] args) {
		Integer a = 2;
		Integer b = 2;
		Integer s = min(a, b);

	}

	static <T extends Number> T min(T a, T b) {
		return a;
	}

}
