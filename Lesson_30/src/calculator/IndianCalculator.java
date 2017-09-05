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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLast() {
		// TODO Auto-generated method stub

	}

	@Override
	public void memoryRestore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void memorySave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void memoryClear() {
		// TODO Auto-generated method stub

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

	@Override
	public String toString() {
		return screen;

	}
}