package com.yedam.lwh.classes;

public class StudentArrayExample {
	public static void main(String[] args) {
		
		
		Student[] stdAry = new Student[3];
		
		
		Student sn = new Student ("choi",20,180,70);
		
		
		Student stnt = new Student(); 
		stnt.setName("hong");
//		stnt.age = 22;
		stnt.setAge(-20);    
		//field에 직접 값을 넣는 것과 method 에 값을 넣는 것의 차이: 데이터에 적합한 값이 들어갈 수 있도록하기 위함.
		stnt.setHeight(170);
		stnt.setWeight(65);
		
		
		Student snt = new Student();
		snt.setName("Lee");
		snt.setAge(30);
//		snt.age = 30;
		snt.setHeight(181);
		snt.setWeight(78);

		
		stdAry[0] = sn;
		stdAry[1] = snt;
		stdAry[2] = stnt;

		stdAry[0] = stdAry[1];
		stdAry[1] = stdAry[2];
		stdAry[2] = stdAry[0];
		
		for(int i=0; i<stdAry.length; i++) {
//			if (stdAry[i].name.equals("choi")) choi만 실행하고싶을때 조건.
			System.out.println(stdAry[i].getName()+ " " + stdAry[i].getAge());
		}
	}
}
