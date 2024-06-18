package oop04.test;

import oop05.modifier01.A;

	public class C {
		public void print() {
			A a=new A();
			System.out.println(a.a+" ");	//다른 패키지 내의 클래스에서는 자식클래스가 아닐떄는 public가능
//			System.out.println(a.b+" ");
//			System.out.println(a.c+" ");
//			System.out.println(a.d+" ");
			System.out.println();
			
		}

}
