package basic07.method;

public class EffectOfPrimaryDataArgument {
	public static void main(String[] args) {
		int a=3;
		int result1=twice(3);
		System.out.println(result1);
		int result2=twice(a);
		System.out.println(result2);
		System.out.println(a);
		
			
		}
	public static int twice(int a) {
		// TODO Auto-generated method stub
		a=a*2;
		return a;
	}
		

	}
