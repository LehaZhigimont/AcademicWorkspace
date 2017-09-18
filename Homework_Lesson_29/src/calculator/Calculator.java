package calculator;

import java.util.LinkedList;

public class Calculator implements CalculatorModel {
	private static final String NUMBERS = "0123456789.";

	private LinkedList<String> history = new LinkedList<String>();
	private String memory = "";
	private String value = "";
	private String screen = "";
	private String previousValue = "";
	private char operator = '0';

	// Done
	@Override
	public void plus() {
		if (previousValue.equals("")) {

			operator = '+';
			previousValue = value;
			history.add(previousValue);
			value = "";
			// history
			if (NUMBERS.contains(history.getLast().substring(history.getLast().length()-1))) {
				history.add("" + operator);
			} else {
				if (!history.getLast().equals("+")) {
					history.set((history.size() - 1), "" + operator);
				}
			}

		} else {
			/*
			 * Неудачная попытка сделать что бы много раз нажимать + if
			 * (value.equals("")) { if (!history.getLast().equals("+")) {
			 * history.add("" + operator + toIntegers(previousValue)); } else {
			 * history.add("" + toIntegers(previousValue)); }
			 * 
			 * value = "" + (Double.parseDouble(previousValue) +
			 * Double.parseDouble(previousValue)); screen =
			 * toIntegers(previousValue); value = "";
			 * 
			 * } else {
			 */
			if (!value.equals("")) {
				// history
				if (!history.getLast().equals("+")) {
					history.add("" + operator + toIntegers(value));
				} else {
					history.add("" + toIntegers(value));
				}
				// plus
				previousValue = "" + (Double.parseDouble(previousValue) + Double.parseDouble(value));
				screen = toIntegers(previousValue);
				value = "";
			}
		}
	}

	// Don't test
	@Override
	public void minus() {
		if (previousValue.equals("")) {

			operator = '-';
			previousValue = value;
			history.add(previousValue);
			value = "";
			// history
			if (NUMBERS.contains(history.getLast().substring(history.getLast().length()-1))) {
				history.add("" + operator);
			} else {
				if (!history.getLast().equals("-")) {
					history.set((history.size() - 1), "" + operator);
				}
			}

		} else {

			if (!value.equals("")) {
				// history
				if (!history.getLast().equals("-")) {
					history.add("" + operator + toIntegers(value));
				} else {
					history.add("" + toIntegers(value));
				}
				// minus
				previousValue = "" + (Double.parseDouble(previousValue) - Double.parseDouble(value));
				screen = toIntegers(previousValue);
				value = "";
			}
		}
	}

	@Override
	public void multiply() {
		if (previousValue.equals("")) {

			operator = '*';
			previousValue = value;
			history.add(previousValue);
			value = "";
			// history
			if (NUMBERS.contains(history.getLast().substring(history.getLast().length()-1))) {
				history.add("" + operator);
			} else {
				if (!history.getLast().equals("*")) {
					history.set((history.size()-1), "" + operator);
				}
			}

		} else {

			if (!value.equals("")) {
				// history
				if (!history.getLast().equals("*")) {
					history.add("" + operator + toIntegers(value));
				} else {
					history.add("" + toIntegers(value));
				}
				// multiply
				previousValue = "" + (Double.parseDouble(previousValue) * Double.parseDouble(value));
				screen = toIntegers(previousValue);
				value = "";
			}
		}
	}

	// Don't test
	@Override
	public void divide() {
		if (previousValue.equals("")) {

			operator = '/';
			previousValue = value;
			history.add(previousValue);
			value = "";
			// history
			if (NUMBERS.contains(history.getLast().substring(history.getLast().length()-1))) {
				history.add("" + operator);
			} else {
				if (!history.getLast().equals("/")) {
					history.set((history.size() - 1), "" + operator);
				}
			}

		} else {

			if (!value.equals("")) {
				// history
				if (!history.getLast().equals("/")) {
					history.add("" + operator + toIntegers(value));
				} else {
					history.add("" + toIntegers(value));
				}
				// divide
				previousValue = "" + (Double.parseDouble(previousValue) / Double.parseDouble(value));
				screen = toIntegers(previousValue);
				value = "";
			}
		}
	}


	// Don't test
	@Override
	public void plusMinus() {
		if (value.charAt(0) != '-') {
			value = '-' + value;
		} else {
			value = value.substring(1, value.length() - 1);
		}
	}

	@Override
	public void inverseNumbeer() {
		// TODO Auto-generated method stub
	}

	// Done
	@Override
	public void equalsNow() {
		//FIXME Сделать так чтобы '=' не выводмлось если небыло введено 2 значение
		switch (operator) {
		case '+':
			plus();
			if(!history.getLast().equals("+")){
			history.add("=");
			history.add(toIntegers(previousValue));
			}
			break;
		case '-':
			minus();
			if(!history.getLast().equals("-")){
				history.add("=");
				history.add(toIntegers(previousValue));
				}
			break;
		case '*':
			multiply();
			if(!history.getLast().equals("*")){
				history.add("=");
				history.add(toIntegers(previousValue));
				}
			break;
		case '/':
			divide();
			if(!history.getLast().equals("/")){
				history.add("=");
				history.add(toIntegers(previousValue));
				}
			break;
		default:
			break;
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

	// Done
	@Override
	public void enterDigit(char digit) {
		value = value + digit;
		screen = value;
	}

	// Done
	@Override
	public void enterDigit(int digit) {
		value = value + digit;
		screen = value;
	}

	// Don't test
	@Override
	public void clearError() {
		value = "";
	}

	// Don't test
	@Override
	public void clear() {
		history.clear();
		screen = "";
		memory = "";
		value = "";
		previousValue = "";
		operator = '0';
	}

	// Don't test
	@Override
	public void deleteLast() {
		value = value.substring(0, value.length() - 1);
	}

	// Don't test
	@Override
	public void memoryRestore() {
		value = memory;
	}

	// Don't test
	@Override
	public void memorySave() {
		memory = value;
	}

	// Don't test
	@Override
	public void memoryClear() {
		memory = "";
	}

	@Override
	public double calculateExpression(String exp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double callJavaMath(String methodName, Object[] args) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Done
	@Override
	public String toString() {
		String historyToString = "";
		for (int i = 0; i < history.size(); i++) {
			historyToString += history.get(i);
		}
		return "[" + historyToString + "]" + "\n" + toIntegers(screen) + "\n";
	}

	// Done
	private String toIntegers(String value) {
		if (value.length() > 2) {
			String temp = value.substring((value.length() - 2), value.length());
			if (temp.equals(".0")) {
				value = value.substring(0, (value.length() - 2));
			}
		}
		return value;
	}
}
