
public class WhileExample {
	public static void main(String[] args) {
		int i = (int) (Math.random()* 6) + 1;
		while(false) {
			System.out.println(i);
			if(i == 6) {
				break;
			}
		}
}
}
