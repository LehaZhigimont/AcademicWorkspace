package ClassAnonym;

import ExeplesInternal.Human;

public class HasAnonim {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Human h = new Human(){
			public boolean isDark;
		};

	}

}
