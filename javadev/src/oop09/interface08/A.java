package oop09.interface08;

interface A {
	void abc();
	default void bcd() {
		System.out.println("A인터페이스 의 bcd");
	}

}
