package inherit08;

public class MethodOverriding_3 {
	public static void main(String[] args) {
		
		A aa=new A();
		aa.print1();
		aa.print2();
		System.out.println();
		
		
		B bb= new B();
		bb.print1();
		bb.print2();
		bb.print2(3);
		System.out.println();
		
		
		A ab=new B();
		ab.print1();
		ab.print2();
	}
	

}
