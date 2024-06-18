package oop.class05;

public class A {
	A(){
		System.out.println("첫번쨰 생성자");
	}
	
	A(int a){
		this();
		System.out.println("두번쨰 생성자");
	}
	

}
