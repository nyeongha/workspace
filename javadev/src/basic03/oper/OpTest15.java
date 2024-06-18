package basic03.oper;

public class OpTest15 {
	public static void main(String[] args) {
		
		int a=-256;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(1));

		System.out.println(3<<1);
		System.out.println(-3<<1);
		System.out.println(3<<2);
		System.out.println(-3<<1);
		System.out.println();
		
		System.out.println(5>>1);
		System.out.println(-5>>1);
		System.out.println(5>>2);
		System.out.println(-5>>2);
		System.out.println();
		
		System.out.println(3>>>1);
		System.out.println(-3>>>31);
		

}}

