package refernceType;

public class CalculatorExample {
	public static void main(String[] args) {
				
	int num1 = 6;
	int num2 = 5;

	sum(num1, num2);
		minus(num1, num2);
		multi(num1, num2);
		devide(num1, num2);
		
		
	}

	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println("두수의 합은: " + result);
	}

	public static void minus(int x, int y) {
		int result = x - y;

		System.out.println("두수의 차이는: " + result);

	}

	public static void multi(int x, int y) {
		int result = x * y;
		System.out.println("두수의 곱은: " + result);
	}

	public static void devide(double x, double y) {
		double result = x / y;
		System.out.println("두수의 나눗셈은:" + result);

	}
		
	
	}

