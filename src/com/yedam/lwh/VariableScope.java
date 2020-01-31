package com.yedam.lwh;

public class VariableScope {
  public static void main(String[] args) {
	  int sum, var1;
	  
	  if(true) {
		  int var2;
		  var1 = 10;
		  var2 = 20;
		  sum = var1 + var2;
		  System.out.println("두수의 합은:" + sum);
	  }
	  System.out.println(var1);
	  //System.out.println(var2); //var2 는 if block안에 사용가능
	  System.out.println(sum);
	  sum = 50;
	  System.out.println(sum);
	  
	  for(int i=0; i<5; i++) {
		  var1 = var1 + i;
		  int var2 = 10;
		  System.out.println("var1: " + var1 + ", var2 " + var2);
	  }
  }
}
