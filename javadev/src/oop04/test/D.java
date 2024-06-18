package oop04.test;

import oop05.modifier01.A;

	public class D extends A{
		public void print() {
			System.out.println(a+" ");	//다른 패키지 내의 클래스에서는 자식클래스가 아닐떄는 public가능
			System.out.println(b+" ");
//			System.out.println(c+" ");
//			System.out.println(d+" ");
			System.out.println();
			
		}

}
