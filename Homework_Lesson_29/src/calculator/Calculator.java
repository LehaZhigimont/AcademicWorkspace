package calculator;

import java.util.LinkedList;

public class Calculator implements CalculatorModel {
	private static final String NUMBERS = "0123456789";

	private LinkedList<String> history = new LinkedList();
	private String memory = "";
	private String value = "";
	private String screen = "";
	private String previousValue = "";
	private char operator = '0';
	private boolean flag = true;

	/*
	 * Done 100%
	 */
	@Override
	public void plus() {
		// Если преведушее значение пустое, записать текущие в преведушие,
		// текушие затереть.
		// Если текушие значение пустое, выполнить сложение преведущих. Иначе
		// сложить текущие и преведущие.

		if (previousValue.equals("")) {

			operator = '+';
			previousValue = value;
			history.add(previousValue);
			//value = "";

			// history for operator
			if (NUMBERS.contains(history.getLast())) {
				history.add("" + operator);
			} else {
				if (!history.getLast().equals("+")) {
					history.set((history.size() - 1), "" + operator);
				}
			}
			
		} else {
			if (value.equals("")) {
				if (!history.getLast().equals("+")) {
					toIntegers(value);
					history.add("" + operator + value);
				} else {
					toIntegers(value);
					history.add("" + previousValue);
				}
				value = "" + (Double.parseDouble(previousValue) + Double.parseDouble(previousValue));
				previousValue = "";
				screen = value;
				toIntegers(value);

			} else {
				if (!history.getLast().equals("+")) {
					toIntegers(value);
					history.add("" + operator + value);
				} else {
					toIntegers(value);
					history.add("" + value);
				}
				value = "" + (Double.parseDouble(previousValue) + Double.parseDouble(value));
				previousValue = "";
				screen = value;
				toIntegers(value);
			}
		}
	}

	/*
	 * Done 100%
	 */
	@Override
	public void minus() {
		// Если преведушее значение пустое, записать текущие в преведушие,
		// текушие затереть.
		// Если текушие значение пустое, выполнить вычитание преведущих. Иначе
		// вычесть текущие и преведущие.

		if (previousValue.equals("")) {

			operator = '+';
			previousValue = value;
			history.add(previousValue);
			value = "";

			// history for operator
			if (NUMBERS.contains(history.getLast())) {
				history.add("" + operator);
			} else {
				if (!history.getLast().equals("-")) {
					history.set((history.size() - 1), "" + operator);
				}
			}
		} else {
			if (value.equals("")) {
				if (!history.getLast().equals("+")) {
					toIntegers(value);
					history.add("" + operator + value);
				} else {
					toIntegers(value);
					history.add("" + value);
				}
				value = "" + (Double.parseDouble(previousValue) - Double.parseDouble(previousValue));
				previousValue = "";
				screen = value;
				toIntegers(value);
			} else {
				if (!history.getLast().equals("+")) {
					toIntegers(value);
					history.add("" + operator + value);
				} else {
					toIntegers(value);
					history.add("" + value);
				}
				value = "" + (Double.parseDouble(previousValue) - Double.parseDouble(value));
				previousValue = "";
				screen = value;
				toIntegers(value);
			}
		}
	}

	/*
	 * Done 100% (non-Javadoc)
	 */
	@Override
	public void multiply() {
		// Если преведушее значение пустое, записать текущие в преведушие,
		// текушие затереть.
		// Если текушие значение пустое, выполнить умножение преведущих. Иначе
		// умнжить текущие и преведущие.

		if (previousValue.equals("")) {

			operator = '*';
			previousValue = value;
			history.add(previousValue);
			value = "";

			// history for operator
			if (NUMBERS.contains(history.getLast())) {
				history.add("" + operator);
			} else {
				if (!history.getLast().equals("+")) {
					history.set((history.size() - 1), "" + operator);
				}
			}
		} else {
			if (value.equals("")) {
				if (!history.getLast().equals("+")) {
					toIntegers(value);
					history.add("" + operator + value);
				} else {
					toIntegers(value);
					history.add("" + value);
				}
				value = "" + (Double.parseDouble(previousValue) * Double.parseDouble(previousValue));
				previousValue = "";
				screen = value;
				toIntegers(value);
			} else {
				if (!history.getLast().equals("+")) {
					toIntegers(value);
					history.add("" + operator + value);
				} else {
					toIntegers(value);
					history.add("" + value);
				}
				value = "" + (Double.parseDouble(previousValue) * Double.parseDouble(value));
				previousValue = "";
				screen = value;
				toIntegers(value);
			}
		}
	}

	/*
	 * Done ?% (non-Javadoc)
	 */
	@Override
	public void divide() {
		// Если преведушее значение пустое, записать текущие в преведушие,
		// текушие затереть.
		// Если текушие значение пустое, выполнить деление преведущих. Иначе
		// делить текущие и преведущие.

		if (previousValue.equals("")) {

			operator = '/';
			previousValue = value;
			history.add(previousValue);
			value = "";

			// history for operator
			if (NUMBERS.contains(history.getLast())) {
				history.add("" + operator);
			} else {
				if (!history.getLast().equals("+")) {
					history.set((history.size() - 1), "" + operator);
				}
			}
		} else {
			if (value.equals("")) {
				if (!history.getLast().equals("+")) {
					toIntegers(value);
					history.add("" + operator + value);
				} else {
					toIntegers(value);
					history.add("" + value);
				}
				value = "" + (Double.parseDouble(previousValue) / Double.parseDouble(previousValue));
				previousValue = "";
				toIntegers(value);
			} else {
				if (!history.getLast().equals("+")) {
					toIntegers(value);
					screen = value;
					history.add("" + operator + value);
				} else {
					toIntegers(value);
					history.add("" + value);
				}
				value = "" + (Double.parseDouble(previousValue) / Double.parseDouble(value));
				previousValue = "";
				screen = value;
				toIntegers(value);
			}
		}
	}

	/*
	 * Done 100% (non-Javadoc)
	 */
	@Override
	public void plusMinus() {
		if (value.charAt(0) != '-') {
			value = '-' + value;
		} else {
			value = value.substring(1, value.length() - 1);
		}

	}

	/*
	 * Done 0% (non-Javadoc)
	 * 
	 * @see calculator.CalculatorModel#plus()
	 */
	@Override
	public void inverseNumbeer() {
		// TODO Auto-generated method stub

	}

	/*
	 * Done 20% (non-Javadoc)
	 */
	@Override
	public void equalsNow() {
		switch (operator) {
		case '+':
			plus();
			history.add("=");
			history.add(value);
			break;
		case '-':
			minus();
			history.add("=");
			history.add(value);
			break;
		case '*':
			multiply();
			history.add("=");
			history.add(value);
			break;
		case '/':
			divide();
			history.add("=");
			history.add(value);
			break;

		default:
			break;
		}
		flag = false;
	}

	/*
	 * Done 0% (non-Javadoc)
	 * 
	 * @see calculator.CalculatorModel#plus()
	 */
	@Override
	public void prosent() {
		// TODO Auto-generated method stub

	}

	/*
	 * Done 0% (non-Javadoc)
	 * 
	 * @see calculator.CalculatorModel#plus()
	 */
	@Override
	public void sqrt() {
		// TODO Auto-generated method stub

	}

	/*
	 * Done 100%
	 */
	@Override
	public void enterDigit(char digit) {
		if (flag) {
			value = value + digit;
		} else {
			value = "" + digit;
			flag = true;
		}
	}

	/*
	 * Done 100%
	 */
	@Override
	public void enterDigit(int digit) {
		if (flag) {
			value = value + digit;
		} else {
			value = "" + digit;
			flag = true;
		}
	}

	/*
	 * Done 100%
	 */
	@Override
	public void clearError() {
		value = "";
	}

	/*
	 * Done 100%
	 */
	@Override
	public void clear() {
		history.clear();
		memory = "";
		value = "";
		previousValue = "";
		operator = '0';
	}

	/*
	 * Done 0% (non-Javadoc)
	 * 
	 * @see calculator.CalculatorModel#plus()
	 */
	@Override
	public void deleteLast() {
		// TODO Auto-generated method stub

	}

	/*
	 * Done 100% (non-Javadoc)
	 * 
	 * @see calculator.CalculatorModel#plus()
	 */
	@Override
	public void memoryRestore() {
		value = memory;
	}

	/*
	 * Done 100% (non-Javadoc)
	 * 
	 * @see calculator.CalculatorModel#plus()
	 */
	@Override
	public void memorySave() {
		//
		memory = value;
	}

	/*
	 * Done 100% (non-Javadoc)
	 * 
	 * @see calculator.CalculatorModel#plus()
	 */
	@Override
	public void memoryClear() {
		//
		memory = "";
	}

	/*
	 * Done 0% (non-Javadoc)
	 * 
	 * @see calculator.CalculatorModel#plus()
	 */
	@Override
	public double calculateExpression(String exp) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * Done 0% (non-Javadoc)
	 * 
	 * @see calculator.CalculatorModel#plus()
	 */
	@Override
	public double callJavaMath(String methodName, Object[] args) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * Done 50% (non-Javadoc)
	 */
	@Override
	public String toString() {
		return history + "\n" + value;
		// TODO Реализовать вывод целых чисел, без остатка
	}

	private String toIntegers(String value) {
		// TODO сделать метод.
		// если число не имеет остатка привести к целому виду
		return value;
	}
}
