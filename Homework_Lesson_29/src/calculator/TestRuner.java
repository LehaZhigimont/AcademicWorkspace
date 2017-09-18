package calculator;

public class TestRuner {

	public static void main(String[] args) {
		CalculatorModel calc = new Calculator();	
		CalculatorTest.testPlus(calc);
		CalculatorTest.testPlus2(calc);
		CalculatorTest.testPlus3(calc);
		//CalculatorTest.testMultiply(calc);
	}
	
	
	
	
	
	
	
	private static class CalculatorTest {
		
		public static void testPlus(CalculatorModel calc){
			calc.enterDigit(2);
			calc.plus();
			calc.plus();
			System.out.println(calc);
			calc.clear();
		}
		
		public static void testPlus2(CalculatorModel calc){
			calc.enterDigit(7);
			calc.plus();
			calc.enterDigit(14);
			calc.equalsNow();
			//calc.clear();
			System.out.println(calc);
			calc.clear();
		}
		public static void testPlus3(CalculatorModel calc){
			calc.enterDigit(3);
			calc.plus();
			calc.plus();
			calc.plus();
			System.out.println(calc);
			calc.clear();
		}
		public static void testMultiply(CalculatorModel calc){
			calc.enterDigit(321);
			calc.multiply();
			calc.enterDigit(321);
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
		}	
	}
}
