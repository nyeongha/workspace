package basic02.datatype;

public class DataType02 {
	public static void main(String[] args) {
		//float의 정밀도는 대략 소수점 아래 7자리
		float f1=1.000_000_1f;
		System.out.println(f1);
		
		float f2=1.000_000_01f;
		System.out.println(f2);	//오차발생
		
		//double
		double d1=1.000_000_000_000_001;
		System.out.println(d1);
		
		double d2=1.000_000_000_000_0001;
		System.out.println(d2);
		
		
		
	}

}
