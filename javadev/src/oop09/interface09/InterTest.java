package oop09.interface09;

public class InterTest {
	public static void main(String[] args) {
		InterImpl impl = new InterImpl();
		
		InterfaceA ia=impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib=impl;
		ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic=impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
	}

}
