package calculator;
/**
 * Данный интефейс создает модель калькулятора.<br>
 * Содержит в себе методы для реализации:<br>
 * <b>plus</b> - слаживание<br>
 * <b>minus</b> - отнимание<br>
 * <b>multiply</b> - умножение<br>
 * <b>divide</b> - деление<br>
 * <b>plusMinus</b> - указывает что число введено или будет введено отрицательное<br>
 * <b>inverseNumbeer</b> - <br>
 * <b>equalsNow</b> - <br>
 * <b>prosent</b> - вычисляет процент введеного числа<br>
 * <b>sqrt</b> - вычисляет квадрат<br>
 * <b>enterDigit</b> - <b>char</b> или <b>int</b> <i>digit</i> принимает для ввода число или символ ( '.' '(' ')' ) <br>
 * <b>CE</b> - <br>
 * <b>C</b> - <br>
 * <b>calculateExpression</b> - <br>
 * <b>callJavaMath</b> - <br>
 * <b></b> - <br>
 * 
 */
public interface CalculatorModel {
	void plus();// изменяет внутрее состояние объекта
	void minus();
	void multiply();
	void divide();
	void plusMinus();
	void inverseNumbeer();
	void equalsNow();
	void prosent();
	void sqrt();
	void enterDigit(char digit);
	void enterDigit(int digit);
	void CE();
	void C();
	
	//дополнителные методы
	double calculateExpression(String exp);
	double callJavaMath(String methodMain, Object[]args);
}
