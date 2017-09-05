package calculator;

public interface CalculatorModel {
	
	void plus();
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
	void clearError();
	void clear();
	void deleteLast();
	void memoryRestore();
	void memorySave();
	void memoryClear();
	
	//дополнитиеьные 
	double calculateExpression(String exp);
	double callJavaMath(String methodName, Object[] args);
	/**
	 * 
	 * @return то, что былобы на экране реального калькулятора
	 */
	String toString();

}
