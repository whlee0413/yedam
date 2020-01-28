
public class LoopExample {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++)
			if (i % 3 == 0 && i % 7 == 0)
				System.out.println("3의 배수이면서 7의 배수 출력" + i);

		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println("3의 배수이면서 7의 배수는" + i);
			}
			i++;

		}
	}
}