package inherit18;

public class ObjectMethod_equals {
	public static void main(String[] args) {
		A a1=new A("안녕");
		A a2=new A("안녕");
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		B b1=new B("안녕");
		B b2=new B("안녕");
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
		
	}

}
