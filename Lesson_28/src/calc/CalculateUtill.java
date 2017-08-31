package calc;

import java.util.LinkedList;

public class CalculateUtill {
	public static final String OPERATORS = "+-";
	public static final String NUBERS = "0123456789";

	/**
	 * Переменная <i>digitStart</i>(<b>Integer</b>) определяет откуда
	 * стартовать, вложеному циклу поиска оператора. Переменная
	 * <i>newDigit</i>(<b>String</>) временно хранит число для добавления в
	 * масив <i>array</i>.
	 * 
	 * @param exp
	 *            - Пришедшее <b>String</b> выражене (<b>expression</b>) для
	 *            вычисления
	 * 
	 * @return - Возвращает <i>result</i>(<b>double</b>) результат выражения
	 *
	 * 
	 */
	public static double calc(String exp) {
		LinkedList<String> array = new LinkedList<String>();
		int digitStartIdx = 1;
		double result = 0;

		if (exp.charAt(0) == '-') {
			array.add(0, "-");
		} else {
			array.add(0, "+");
			if (exp.charAt(0) != '+') {
				exp = "+" + exp;
			}
		}

		for (int i = digitStartIdx; i < exp.length(); i++) {
			for (int j = digitStartIdx; j < exp.length(); j++) {
				if (OPERATORS.contains(exp.substring(j, j + 1)) || (j == exp.length() - 1)) {
					String newDigit;
					if (j == (exp.length() - 1)) {
						newDigit = exp.substring(digitStartIdx, j + 1);
						i = j + 1;
						array.add(newDigit);
						break;
					} else {
						newDigit = exp.substring(digitStartIdx, j);
					}
					array.add(newDigit);
					array.add(exp.substring(j, j + 1));
					digitStartIdx = j + 1;
					i = digitStartIdx;
					break;
				}
			}
		}
		for (int i = 0; i < array.size(); i = i + 2) {
			if (array.get(i).equals("+")) {
				result = result + Double.parseDouble(array.get(i + 1));
			} else if (array.get(i).equals("-")) {
				result = result - Double.parseDouble(array.get(i + 1));
			} else if (array.get(i).equals("*")) {
				result = result * Double.parseDouble(array.get(i + 1));
			} else if (array.get(i).equals("/")) {
				result = result / Double.parseDouble(array.get(i + 1));
			}
		}
		System.out.println(array);
		return result;
	}

}
/**
 * <h2>Конспект</h2> <br>
 * <h1>Алгоритм 1:</h1> <br>
 * вырожение = [выражение1, оператор, выражение2, ...]; <br>
 * 2+2*2 = [2, +, 2*2]; <br>
 * <h1>Алгоритм 2:</h1> <br>
 * постфиксная запись(обратная польская запись): <br>
 * 2+3 => 2,3+ = 5; <br>
 * 2+3+4+5 => 2,3+4+5 => 5,4+5 => 9,5+ => 14; <br>
 * <h1>Алгоритм 3:</h1> <br>
 * (2+7)./(3+7).+3+4/3/(3+7).; <br>
 * поиск мест где количество "(" = ")"("." - в примере); <br>
 */
