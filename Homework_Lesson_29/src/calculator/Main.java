package calculator;

public class Main {

	public static void main(String[] args) {
		CalculatorModel calc = new Calculator();
		calc.enterDigit(9);
		//calc.enterDigit('.');
		//calc.enterDigit(9);
		calc.plus();
		calc.enterDigit(1);
		calc.equalsNow();
		System.out.println(calc); 

	}

}