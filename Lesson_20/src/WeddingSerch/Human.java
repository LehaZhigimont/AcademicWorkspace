package WeddingSerch;

public class Human {
	private char sex;
	private String name;
	private Human whoHeLike;

	public Human() {
		sex = Math.random() > 0.5 ? 'M' : 'F';
		name = (sex == 'M') ? "Vasya" + (int) (Math.random() * 10) : "Masha" + (int) (Math.random() * 10);
		whoHeLike = null;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Human getWhoHeLike() {
		return whoHeLike;
	}

	public void setWhoHeLike(Human whoHeLike) {
		this.whoHeLike = whoHeLike;
	}

	public void print() {

		if (getWhoHeLike() == null) {
			System.out.println("I'm " + name + " I love " + getWhoHeLike());
		} else {
			System.out.println("I'm " + name + " I love " + whoHeLike.getName());
		}
	}

}
