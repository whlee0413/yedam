package refernceType;

public class MethodExample {
	public static void main(String[] args) {
		int num1, num2;
		int result;
		num1 = 10;
		num2 = 20;
//		result = (num1 + num2) * 3;
//		System.out.println("결과값은: " + result);
		multiAfterSum(num1, num2);
		
		int a1, a2;
		a1=100;
		a2=200;
//		result = (a1 + a2) * 3; //계산식이 복잡
//		System.out.println("결과값은: " + result);
		multiAfterSum(a1, a2);
	}
	//method
	public static void multiAfterSum(int a, int b) {
		int n1, n2, rslt;
		n1 = a;
		n2 = b;
		rslt = (n1 + n2) * 3;
		System.out.println("결과값은: " + rslt);
	}
}
