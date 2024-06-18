package inherit06;

public class MethodOverriding_1 {
	public static void main(String[] args) {
		A aa=new A();
		aa.print();
		
		
		B bb=new B();
		bb.print();
		
		A ab=new B();
		ab.print();
		
	}

}
