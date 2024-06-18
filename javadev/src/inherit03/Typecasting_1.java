package inherit03;

public class Typecasting_1 {
	public static void main(String[] args) {
		A ac=(A) new C(); //c->a업캐스팅
		B bb=new B();
		A a=(A) bb;
		
		A aa=new A();
		
		
		A ab=new B();
		B b=(B) ab;
		
		A ad=new D();
		B b1=(B) ad;
		D d1=(D) ad;
	}

}
