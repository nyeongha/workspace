package inherit04;

public class Typecasting_2 {
	public static void main(String[] args) {
		A aa= new A();
		System.out.println(aa.m);
		aa.abc();
		
		B bb= new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		
		A ab=new B();
		System.out.println(ab.m);
		ab.abc();
		
		
	}

}
