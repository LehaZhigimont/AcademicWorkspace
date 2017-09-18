package calculator;

public class TestRuner {

	public static void main(String[] args) {
		CalculatorModel c = new Calculator();
		System.out.println("Test for Plus***************************************************");
		CalculatorTest.test1Plus(c);
		CalculatorTest.test2Plus(c);
		CalculatorTest.test3Plus(c);
		CalculatorTest.test4Plus(c);
		CalculatorTest.test5Plus(c);
		System.out.println("Test for Minus**************************************************");
		CalculatorTest.test1Minus(c);
		CalculatorTest.test2Minus(c);
		CalculatorTest.test3Minus(c);
		CalculatorTest.test4Minus(c);
		System.out.println("Test for Multiply***********************************************");
		CalculatorTest.test1Multiply(c);
		CalculatorTest.test2Multiply(c);
		CalculatorTest.test3Multiply(c);
		CalculatorTest.test4Multiply(c);
		System.out.println("Test for Divide*************************************************");
		CalculatorTest.test1Divide(c);
		CalculatorTest.test2Divide(c);
		CalculatorTest.test3Divide(c);
		CalculatorTest.test4Divide(c);
		CalculatorTest.test5Divide(c);
		System.out.println("Test for divide*************************************************");
		CalculatorTest.test1plusMinus(c);
		CalculatorTest.test2plusMinus(c);
		CalculatorTest.test3plusMinus(c);
		CalculatorTest.test4plusMinus(c);
		CalculatorTest.test5plusMinus(c);
		System.out.println("Test for dot****************************************************");
		CalculatorTest.test1dot(c);
		CalculatorTest.test2dot(c);
		CalculatorTest.test3dot(c);
		CalculatorTest.test4dot(c);
		CalculatorTest.test5dot(c);
		CalculatorTest.test6dot(c);
	}
 
	private static class CalculatorTest {
		// Test for plus***************************************************
		public static void test1Plus(CalculatorModel c) {
			System.out.println("Test 1 for plus: enterDigit > action*2");
			c.enterDigit(2);
			c.plus();
			c.plus();
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 2; result=2" + "\n\n\n");
		}
		public static void test2Plus(CalculatorModel calc) {
			System.out.println("Test 2 for plus: enterDigit > action > enterDigit > equals");
			calc.enterDigit(7);
			calc.plus();
			calc.enterDigit(1);
			calc.enterDigit(4);
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 7,14; result=21" + "\n\n\n");
		}
		public static void test3Plus(CalculatorModel calc) {
			System.out.println("Test 3 for plus: enterDigit > action*3");
			calc.enterDigit(3);
			calc.plus();
			calc.plus();
			calc.plus();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 3; result=3" + "\n\n\n");
		}
		public static void test4Plus(CalculatorModel calc) {
			System.out.println("Test 4 for plus: enterDigit > action*3 > equals");
			calc.enterDigit(3);
			calc.plus();
			calc.plus();
			calc.plus();
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 3; result=3" + "\n\n\n");
		}
		public static void test5Plus(CalculatorModel calc) {
			System.out.println("Test 5 for plus: enterDigit > action > enterDigit > equals");
			calc.enterDigit(7);
			calc.enterDigit(7);
			calc.plus();
			calc.enterDigit(1);
			calc.enterDigit(4);
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 77,14; result=91" + "\n\n\n");
		}
		// Test for multiply***************************************************
		public static void test1Multiply(CalculatorModel calc) {
			System.out.println("Test 1 for multiply: enterDigit > action*2");
			calc.enterDigit(3);
			calc.enterDigit(2);
			calc.enterDigit(1);
			;
			calc.multiply();
			calc.multiply();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 321; result= 321" + "\n\n\n");
		}
		public static void test2Multiply(CalculatorModel calc) {
			System.out.println("Test 2 for multiply: enterDigit > action > enterDigit > equals");
			calc.enterDigit(3);
			calc.enterDigit(2);
			calc.enterDigit(1);
			calc.multiply();
			calc.enterDigit(2);
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 321,2; result= 642" + "\n\n\n");
		}
		public static void test3Multiply(CalculatorModel calc) {
			System.out.println("Test 3 for multiply: enterDigit > action*3");
			calc.enterDigit(3);
			calc.multiply();
			calc.multiply();
			calc.multiply();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 3; result= 3" + "\n\n\n");
		}
		public static void test4Multiply(CalculatorModel calc) {
			System.out.println("Test 4 for multiply: enterDigit > action*3 > equals");
			calc.enterDigit(3);
			calc.enterDigit(2);
			calc.enterDigit(1);
			calc.multiply();
			calc.multiply();
			calc.multiply();
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 321; result= 321" + "\n\n\n");
		}
		// Test for minus***************************************************
		public static void test1Minus(CalculatorModel calc) {
			System.out.println("Test 1 for minus: enterDigit > action*2");
			calc.enterDigit(5);
			calc.plus();
			calc.plus();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 5; result= 5" + "\n\n\n");
		}
		public static void test2Minus(CalculatorModel calc) {
			System.out.println("Test 2 for minus: enterDigit > action > enterDigit > equals");
			calc.enterDigit(2);
			calc.enterDigit(0);
			calc.minus();
			calc.enterDigit(1);
			calc.enterDigit(1);
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 20,11; result= 9" + "\n\n\n");
		}
		public static void test3Minus(CalculatorModel calc) {
			System.out.println("Test 3 for minus: enterDigit > action*3");
			calc.enterDigit(5);
			calc.plus();
			calc.plus();
			calc.plus();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 5; result= 5" + "\n\n\n");
		}
		public static void test4Minus(CalculatorModel calc) {
			System.out.println("Test 4 for minus: enterDigit > action*3 > equals");
			calc.enterDigit(5);
			calc.plus();
			calc.plus();
			calc.plus();
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 5; result= 5" + "\n\n\n");
		}
		// Test for divide***************************************************
		public static void test1Divide(CalculatorModel calc) {
			System.out.println("Test 1 for divide: enterDigit > action*2");
			calc.enterDigit(9);
			calc.enterDigit(0);
			calc.divide();
			calc.divide();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 90; result= 90" + "\n\n\n");
		}
		public static void test2Divide(CalculatorModel calc) {
			System.out.println("Test 2 for divide: enterDigit > action > enterDigit > equals");
			calc.enterDigit(10);
			calc.divide();
			calc.enterDigit(2);
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 10,2; result= 5" + "\n\n\n");
		}
		public static void test3Divide(CalculatorModel calc) {
			System.out.println("Test 3 for divide: enterDigit > action*3");
			calc.enterDigit(9);
			calc.enterDigit(0);
			calc.divide();
			calc.divide();
			calc.divide();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 90; result= 90" + "\n\n\n");
		}
		public static void test4Divide(CalculatorModel calc) {
			System.out.println("Test 4 for divide: enterDigit > action*3 > equals");
			calc.enterDigit(90);
			calc.divide();
			calc.divide();
			calc.divide();
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 90; result= 90" + "\n\n\n");
		}
		public static void test5Divide(CalculatorModel calc) {
			System.out.println("Test 5 for divide: enterDigit > action > enterDigit > equals");
			calc.enterDigit(11);
			calc.divide();
			calc.enterDigit(2);
			calc.equalsNow();
			System.out.println(calc);
			calc.clear();
			System.out.println("enterDigit= 11,2; result= 5.5" + "\n\n\n");
		}
		// Test for plusMinus***************************************************
		public static void test1plusMinus(CalculatorModel c) {
			System.out.println("Test 1 for enter: eD > pM ");
			c.enterDigit(8);
			c.plusMinus();
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 8; result= -8" + "\n\n\n");
		}
		public static void test2plusMinus(CalculatorModel c) {
			System.out.println("Test 2 for enter: eD > pM > eD");
			c.enterDigit(8);
			c.plusMinus();
			c.enterDigit(1);
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 81; result= -81" + "\n\n\n");
		}
		public static void test3plusMinus(CalculatorModel c) {
			System.out.println("Test 3 for enter: eD > pM > eD > pM");
			c.enterDigit(8);
			c.plusMinus();
			c.enterDigit(1);
			c.plusMinus();
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 81; result= 81" + "\n\n\n");
		}
		public static void test4plusMinus(CalculatorModel c) {
			System.out.println("Test 4 for enter: eD > pM > eD > pM > pM");
			c.enterDigit(8);
			c.plusMinus();
			c.enterDigit(1);
			c.plusMinus();
			c.plusMinus();
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 81; result= -81" + "\n\n\n");
		}
		public static void test5plusMinus(CalculatorModel c) {
			System.out.println("Test 5 for enter: eD > eD > pM");
			c.enterDigit(8);
			c.enterDigit(1);
			c.plusMinus();
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 81; result= -81" + "\n\n\n");
		}

		// Test for dot***************************************************
		public static void test1dot(CalculatorModel c) {
			System.out.println("Test 1 for enter dot: eD('.')");
			c.enterDigit('.');
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= '.'; result= 0." + "\n\n\n");
		}
		public static void test2dot(CalculatorModel c) {
			System.out.println("Test 2 for enter dot: eD('.') > eD");
			c.enterDigit('.');
			c.enterDigit(2);
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 0.2; result= 0.2" + "\n\n\n");
		}
		public static void test3dot(CalculatorModel c) {
			System.out.println("Test 3 for enter dot: eD('.') > eD > eD('.')");
			c.enterDigit('.');
			c.enterDigit(2);
			c.enterDigit('.');
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 0.2; result= 0.2" + "\n\n\n");
		}
		public static void test4dot(CalculatorModel c) {
			System.out.println("Test 4 for enter dot: eD > eD('.') > eD");
			c.enterDigit(2);
			c.enterDigit('.');
			c.enterDigit(2);
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 2.2; result= 2.2" + "\n\n\n");
		}
		public static void test5dot(CalculatorModel c) {
			System.out.println("Test 5 for enter dot: eD > eD('.')> eD('.') > eD");
			c.enterDigit(2);
			c.enterDigit('.');
			c.enterDigit('.');
			c.enterDigit(2);
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 2.2; result= 2.2" + "\n\n\n");
		}
		public static void test6dot(CalculatorModel c) {
			System.out.println("Test 6 for enter dot: eD('.')> eD('.') > eD");
			c.enterDigit('.');
			c.enterDigit('.');
			c.enterDigit(2);
			System.out.println(c);
			c.clear();
			System.out.println("enterDigit= 0.2; result= 0.2" + "\n\n\n");
		}
	}
}
