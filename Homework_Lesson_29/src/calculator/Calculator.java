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

	/**
	 * Плюс
	 */
	@Override
	public void plus() {
		if (previousValue.equals("")) {

			operator = '+';
			previousValue = value;
			history.add(previousValue);
			value = "";
			// history
			if (NUMBERS.contains(history.getLast().substring(history.getLast().length() - 1))) {
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

	/**
	 * Минус
	 */
	@Override
	public void minus() {
		if (previousValue.equals("")) {

			operator = '-';
			previousValue = value;
			history.add(previousValue);
			value = "";
			// history
			if (NUMBERS.contains(history.getLast().substring(history.getLast().length() - 1))) {
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

	/**
	 * Умножение
	 */
	@Override
	public void multiply() {
		if (previousValue.equals("")) {

			operator = '*';
			previousValue = value;
			history.add(previousValue);
			value = "";
			// history
			if (NUMBERS.contains(history.getLast().substring(history.getLast().length() - 1))) {
				history.add("" + operator);
			} else {
				if (!history.getLast().equals("*")) {
					history.set((history.size() - 1), "" + operator);
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

	/**
	 * Деление
	 */
	@Override
	public void divide() {
		if (previousValue.equals("")) {

			operator = '/';
			previousValue = value;
			history.add(previousValue);
			value = "";
			// history
			if (NUMBERS.contains(history.getLast().substring(history.getLast().length() - 1))) {
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

	/**
	 * меняет значение вводимого числа на отрицацельное и обратно
	 */
	@Override
	public void plusMinus() {
		//FIXME имеет баг с комбо вводом
		if (value.charAt(0) != '-') {
			value = '-' + value;
		} else {
			value = value.substring(1, value.length() - 1);
		}
	}

	/**
	 * 
	 */
	@Override
	public void inverseNumbeer() {
		// TODO Auto-generated method stub
	}

	/**
	 * Выполняет введеное выражение
	 */
	@Override
	public void equalsNow() {
		switch (operator) {
		case '+':
			plus();
			if (!history.getLast().equals("+")) {
				history.add("=");
				history.add(toIntegers(previousValue));
			}
			break;
		case '-':
			minus();
			if (!history.getLast().equals("-")) {
				history.add("=");
				history.add(toIntegers(previousValue));
			}
			break;
		case '*':
			multiply();
			if (!history.getLast().equals("*")) {
				history.add("=");
				history.add(toIntegers(previousValue));
			}
			break;
		case '/':
			divide();
			if (!history.getLast().equals("/")) {
				history.add("=");
				history.add(toIntegers(previousValue));
			}
			break;
		default:
			break;
		}
	}

	/**
	 * 
	 */
	@Override
	public void prosent() {
		// TODO prosent()

	}

	/**
	 * Вычисление квадратного корня
	 */
	@Override
	public void sqrt() {
		// FIXME Сделать работу со старым значением.
		if (!value.equals("") || !value.equals("0.") || !value.equals("0")) {
			value = "" + Math.sqrt(Double.parseDouble(value));
			screen = value;
		}
	}

	/**
	 * Ввод числа
	 */
	@Override
	public void enterDigit(char digit) {
		if (value.equals("")) {
			value = "0.";
			screen = value;
		} else {
			if (!value.contains(".")) {
				value = value + digit;
				screen = value;
			}
		}
	}

	/**
	 * Ввод числа
	 */
	@Override
	public void enterDigit(int digit) {
		value = value + digit;
		screen = value;
	}

	/**
	 * Очищяет введеное значение полностью // Don't test
	 */
	@Override
	public void clearError() {
		value = "";
	}

	/**
	 * Очищяет все значения
	 */
	@Override
	public void clear() {
		history.clear();
		screen = "";
		memory = "";
		value = "";
		previousValue = "";
		operator = '0';
	}

	/**
	 * Удаляет последний символ // Don't test
	 */
	@Override
	public void deleteLast() {
		value = value.substring(0, value.length() - 1);
	}

	/**
	 * Чтение памяти //Don't test
	 */
	@Override
	public void memoryRestore() {
		value = memory;
	}

	/**
	 * Запись в памть // Don't test
	 */
	@Override
	public void memorySave() {
		memory = value;
	}

	/**
	 * Очистка памяти // Don't test
	 */
	@Override
	public void memoryClear() {
		memory = "";
	}

	/**
	 * Возведение в квадрат.
	 */
	public void metodSquare() {
		// FIXME Сделать работу со старым значением.
		if (!value.equals("") || !value.equals("0.") || !value.equals("0")) {
			value = "" + Double.parseDouble(value) * Double.parseDouble(value);
			screen = value;
		}
	}

	@Override
	public double calculateExpression(String exp) {
		return 0;
	}

	@Override
	public double callJavaMath(String methodName, Object[] args) {
		return 0;
	}

	/**
	 * Выводит историю(<b>LinkedList history</b>) в одну строку и с переводом стороки результат действий(<b>screen</b>) 
	 */
	@Override
	public String toString() {
		String historyToString = "";
		for (int i = 0; i < history.size(); i++) {
			historyToString += history.get(i);
		}
		return "[" + historyToString + "]" + "\n" + toIntegers(screen) + "\n";
	}

	/**
	 * Целых чисел типа <i>10.0</i> к целочисленому формату. Принимает
	 * <b>String</b>, проверяет есть ли в конце стороки подстрока <i>".0"</i>.
	 * Если нет, возвращает изначальное значение, иначе удаляет подстроку
	 * <i>".0"</i> и возвращает её.
	 * 
	 * @param <b>value</b>-принимает
	 *            <b>String</b>
	 * @return возвращает тоже значение <b>value</b> или возвращает измененое
	 *         значение <b>value</b>
	 */
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
