package inherit10;



public class OverlapStaticMehtod {
	public static void main(String[] args) {
		System.out.println(A.m);
		System.out.println(B.m);
		System.out.println();
		
		
		
		A aa=new A();
		B bb=new B();
		A ab=new B();
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
		
	}

}
