package oop.class06;

public class ThisMethod_2 {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A(10);
		A a3=new A(10,20);
		
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		B b1=new B();
		B b2=new B(10);
		B b3=new B(10,20);
		b1.print();
		b2.print();
		b3.print();
		
	}
	

}
