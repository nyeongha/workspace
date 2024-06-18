package basic03.oper;

public class p100 {
	
	public static void main(String[] args) {
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(true&&(5<3));
		System.out.println(true&&true);
		System.out.println((5<=5)&&(7>2));
		System.out.println();
		
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(true||(5<3));
		System.out.println(true||true);
		System.out.println((5<=5)||(7>2));
		System.out.println();
		
		
		
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(true^(5<3));
		System.out.println(true^true);
		System.out.println((5<=5)^(7>2));
		System.out.println();
		
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false||!(5<3));
		System.out.println((5<=5)||!(7>2));
		System.out.println();
		
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(true|(5<3));
		System.out.println(true^true);
		System.out.println((5<=5)|(7>2));
		System.out.println();
		
		
	}

}
