package calculator;

import java.util.LinkedList;

public class Calculator implements CalculatorModel {

	//private static final String OPERATORS = "+-";
	private static final String NUMBERS = "0123456789";
	private double result = 0;

	LinkedList<String> exp = new LinkedList<String>();
	
	public Calculator() {
		exp.addFirst("+");
	}

	@Override
	public void plus() {
		exp.addLast("+");
	}

	@Override
	public void minus() {
		exp.addLast("+");
		
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub

	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void plusMinus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inverseNumbeer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void equalsNow() {
		if (exp.getLast() != null || NUMBERS.contains(exp.getLast())) {
			for (int i = 0; i < exp.size(); i = i + 2) {
				if (exp.get(i).equals("+")) {
					result = result + Double.parseDouble(exp.get(i + 1));
				} else if (exp.get(i).equals("-")) {
					result = result - Double.parseDouble(exp.get(i + 1));
				} else if (exp.get(i).equals("*")) {
					result = result * Double.parseDouble(exp.get(i + 1));
				} else if (exp.get(i).equals("/")) {
					result = result / Double.parseDouble(exp.get(i + 1));
				}
			}
		}

	}

	@Override
	public void prosent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sqrt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterDigit(char digit) {
		exp.addLast(String.valueOf(digit));
	}

	@Override
	public void enterDigit(int digit) {
		exp.addLast(String.valueOf(digit));
	}

	@Override
	public void CE() {
		// TODO Auto-generated method stub

	}

	@Override
	public void C() {
		// TODO Auto-generated method stub

	}

	@Override
	public double calculateExpression(String exp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double callJavaMath(String methodMain, Object[] args) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		String print = null;
		return print.valueOf(result);
	}

}