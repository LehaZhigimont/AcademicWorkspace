package Singleton;

public class Singleton {

	private int value;
	private static Singleton instanses = null;

	private Singleton() {
		value = (int) Math.random() * 10;
	}

	public static Singleton getIntance() {
		if (instanses == null) {
			instanses = new Singleton();
			return instanses;
		}
		return instanses;

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
