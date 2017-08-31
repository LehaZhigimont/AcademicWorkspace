package lesson_24.finalExeples;

import Home23.tetris.Field;
import Home23.tetris.figures.*;
@SuppressWarnings("unused")
public final class Game {
	// object field:
	private final Field field = new Field();
	private final int intProperty;
	private final int[] intArrayProperty = new int[10];
	// static:
	public static final boolean FIGURE_IN_GAME = true;
	private static final Field FIELD_2 = new Field();

	public Game() {
		//field = new Field();
		intProperty =4;//обязательно!
		
	}

	public final void start(final Field f) {
		final int i = 2;
		//f = new Field();

		System.out.println("Game is over");
	}
}