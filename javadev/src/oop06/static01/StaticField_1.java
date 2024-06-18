package oop06.static01;



class A{
	int m=3;
	static int n=5;
	
}
public class StaticField_1 {
	public static void main(String[] args) {
		
		//인스턴스필드 활용방법
		A a1=new A();
		System.out.println(a1.m);
		
		//정적필드 활용방법
		System.out.println(A.n);
		A a2=new A();
		System.out.println(a2.n);
		
	}

}
