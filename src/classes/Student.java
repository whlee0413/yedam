package classes;

public class Student {
	// 필드(속성)
	private String  name;
	private int  age;
	private int  height;
	private int  weight;

	// 생성자(인스턴스를 만들면서 필드값을 초기화)
	Student() {
	}

	Student(String name) {
		this.name = name; // this는 field 의미. String name의 name 과 구분하기 위해 this를 붙여줌.
	}

	Student(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 메소드(기능을 담고있음)
	void study() {
		System.out.println("공부한다");
	}

	void eat() {
		System.out.println("밥을 먹는다");
	}

	void sleep() {
		System.out.println("잠을 잔다");
	}

	void setAge(int age) {
		if (age >= 0)
			this.age = age;
		else
			this.age = 0;
	}

	int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
