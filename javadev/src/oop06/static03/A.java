package oop06.static03;

public class A {
	int a;
	static int b;
	static {
		b=5;
		System.out.println("클래스 A가 로딩됐습니다.!");
		
	}
	A(){
		a=3;
	}

}
