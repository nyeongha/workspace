package inherit13;

class B extends A {
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	void bcd() {
		super.abc();
	}

}
