package oop.class06;

public class A {
	int m1,m2,m3,m4;
	A(){
		m1=1;
		m2=2;
		m3=3;
		m4=4;
	}
	A(int a){
		this();
		m1=a;
		
	}
	A(int a,int b){
		this();
		m2=b;
		
	}
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4+" ");
		System.out.println();
	}

}
