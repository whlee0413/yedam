package refernceType;

public class ReferenceTypeExample {
	public static void main(String[] args) {
	 int[] intAry2 = new int[100];
//	 for (int i = 0; i < 100; i++) {
//		 intAry2[i] = (i+1) * 5;
//		 System.out.print(intAry2[i]+ " ");
//		 if(intAry2[i]%25 ==0)
//			 System.out.println();

//		int[] intAry2 = new int[100];
//		for (int i = 0; i < 100; i++) {
//			intAry2[i] = (i + 1) * 5;
//		}
//		for (int i = 0; i < 100; i++) {
//			System.out.print(intAry2[i] + " ");
//			if (i % 5 == 4)
//				System.out.println();
//		}
		int i = 0;
		while (i < 100) {
			System.out.printf("%4d", intAry2[i] + " ");
			if (intAry2[i] % 25 == 0) {
				System.out.println();
			}
			i++;
		}
	}
}
