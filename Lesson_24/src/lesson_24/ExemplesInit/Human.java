package lesson_24.ExemplesInit;
@SuppressWarnings("unused")
public class Human {
	private char sex;
	private String name;
	private Human whoHeLike;

	{	/*при создании обекта код будт выполнен всегда перед конструктором,
		/вне зависимости от конструктора
		*/
		sex = Math.random() > 0.5 ? 'M' : 'F';
		name = (sex == 'M') ? "Vasya" + (int) (Math.random() * 10) : "Masha" + (int) (Math.random() * 10);
		whoHeLike = null;
	}
	//исполниться при загрузке класс, джава машиной
	static{
		System.out.println("static init");
	}
	
	/*public Human() {
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
*/
}
