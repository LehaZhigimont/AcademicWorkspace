package polindrom;

public class Polindrom {

	private static int digits(int a) {
		int col = 0;
		for (int i = 1; a > 1; i++) {
			a = a / 10;
			col = i;
		}
		return col;
	}

	private static int razvorot(int a, int b) {
		int razvorot = 0;
		for (int i = b; a > 0; i--) {
			razvorot = razvorot + ((a % 10) * (int) Math.pow(10, (double) (i - 1)));
			a = a / 10;
		}
		return razvorot;
	}

	public static void main(String[] args) {
		
		int number = 5678765; //test data
		int numberLeft, numberRight;
		int colichestwo = Polindrom.digits(number);
		//проверка если число семетрично с не отзеркаленой цифрой(четное или нет количество)
		if (colichestwo % 2 == 0) {
			numberLeft = number / (int) (Math.pow(10, (colichestwo / 2)));
			numberRight = number % (int) (Math.pow(10, (colichestwo / 2)));
		} else {
			//Поправка чтобы отобрала часть числа до не отзеркаленого числа
			numberLeft = number / (int) (Math.pow(10, (((colichestwo - 1) / 2) + 1)));
			numberRight = number % (int) (Math.pow(10, ((colichestwo - 1) / 2)));
		}
		//вывод сравнения
		if (numberLeft == razvorot(numberRight, (colichestwo / 2)))
			System.out.println("Polindrom");
		else
			System.out.println("Don't polindrom");
	}

}
