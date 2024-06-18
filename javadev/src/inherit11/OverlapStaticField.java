package inherit11;



public class OverlapStaticField {
	public static void main(String[] args) {
		
		A.print();
		B.print();
		System.out.println();
		
		
		A aa=new A();
		B bb=new B();
		A ab=new B();
		
		
		aa.print();
		bb.print();
		ab.print();
		
	}

}
