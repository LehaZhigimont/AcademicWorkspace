package calculator;

public class IndianCalculator implements CalculatorModel {

	private String screen = "";

	private String history = "";

	// последняя введеная операция
	private char lastOperatorToApply = '0';

	// вводилось рание или является результатом преведущей операции
	private String lastResultInMemory = "";

	// введеное сейчас число
	private String currentNumber = "";

	@Override
	public void plus() {
		if (lastOperatorToApply != 0) {
			lastResultInMemory = applyLastOperation().toString();
		}
		lastResultInMemory = currentNumber;
		currentNumber = "0";
		lastOperatorToApply = '+';
	}

	private Double applyLastOperation() {
		switch (lastOperatorToApply) {
		case '+':
			return Double.parseDouble(lastResultInMemory) + Double.parseDouble(currentNumber);
		case '-':
			return Double.parseDouble(lastResultInMemory) - Double.parseDouble(currentNumber);
		case '/':
			return Double.parseDouble(lastResultInMemory) * Double.parseDouble(currentNumber);
		case '*':
			return Double.parseDouble(lastResultInMemory) / Double.parseDouble(currentNumber);
		default:
			return 0d;
		}
	}

	@Override
	public void minus() {
	

	}

	@Override
	public void multiply() {
	

	}

	@Override
	public void divide() {
	

	}

	@Override
	public void plusMinus() {
	

	}

	@Override
	public void inverseNumbeer() {
	

	}

	@Override
	public void equalsNow() {
	

	}

	@Override
	public void prosent() {
	

	}

	@Override
	public void sqrt() {
		

	}

	@Override
	public void enterDigit(char digit) {
		currentNumber = currentNumber + digit;
		screen = currentNumber;
		screen = screen + digit;
	}

	@Override
	public void enterDigit(int digit) {
		currentNumber = currentNumber + digit;
		screen = screen + digit;
	}

	@Override
	public void clearError() {

	}

	@Override
	public void clear() {

	}

	@Override
	public void deleteLast() {

	}

	@Override
	public void memoryRestore() {

	}

	@Override
	public void memorySave() {

	}

	@Override
	public void memoryClear() {

	}

	@Override
	public double calculateExpression(String exp) {

		return 0;
	}

	@Override
	public double callJavaMath(String methodName, Object[] args) {

		return 0;
	}

	@Override
	public String toString() {
		return screen;

	}
}
