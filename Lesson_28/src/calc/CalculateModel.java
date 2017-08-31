package calc;

public interface CalculateModel {
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
