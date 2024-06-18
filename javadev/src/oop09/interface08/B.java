package oop09.interface08;

class B implements A {

	@Override
	public void abc() {
		
		System.out.println("C클래스의 abc()");
	}
	public void bcd() {
		A.super.bcd();
		System.out.println("A클래스의 bcd()");
	}
	

}
