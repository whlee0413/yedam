package classes;

public class People {
	//필드
		String name;
		String from;
		int age;
		
	//생성자
		People(){
			
		}
		People(String name, String from, int age){
			this.name = name;
			this.from = from;
			this.age = age;
		}
		
	//메소드
		void language() {
			System.out.println("한국어를 한다");
		}
		void living( ) {
			System.out.println("대구에 산다");
		}
}
