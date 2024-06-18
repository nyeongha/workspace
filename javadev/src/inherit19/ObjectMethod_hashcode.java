package inherit19;

import java.util.HashMap;

public class ObjectMethod_hashcode {
	public static void main(String[] args) {
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(2, "데이터2");
		hm1.put(3, "데이터3");
		System.out.println(hm1);
		
		HashMap<A,String> hm2=new HashMap<>();
		hm2.put(new A("첫번쪠"),"데이터1");
		hm2.put(new A("두번쪠"),"데이터2");
		hm2.put(new A("세번쪠"),"데이터3");
		
		System.out.println(hm2);
		
		HashMap<B,String> hm3=new HashMap<>();
		hm3.put(new B("첫번쪠"),"데이터1");
		hm3.put(new B("첫번쪠"),"데이터2");
		hm3.put(new B("두번쪠"),"데이터3");
		System.out.println(hm3);
		
	}

}
