
public class WhileExample1 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("합계는" + sum);

		int var1 = 5;
		i = 1;
		while (i <= 9) {
		System.out.println(var1 + " * " + i + " = " + var1 * i);
		i++;
		}
		
		
		
	}
		
}
