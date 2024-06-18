package oop06.static02;


class A{
	int m=3;
	static int n=5;
	
}
public class StaticField_2 {
	public static void main(String[] args) {
		
		//인스턴스필드 활용방법
		A a1=new A();
		A a2=new A();
		
		a1.m=5;
		a2.m=6;
		System.out.println(a1.m);
		System.out.println(a2.m);
		
		
		a1.n=7;
		a2.n=8;
		//정적필드 활용방법
		System.out.println(a1.n);
		System.out.println(a2.n);
		
		A.n=9;
		System.out.println(a1.n);
		System.out.println(a2.n);
		
	}

}
