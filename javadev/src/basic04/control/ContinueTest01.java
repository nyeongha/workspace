package basic04.control;

public class ContinueTest01 {
	public static void main(String[] args) {
		int sum =0;
		for(int i=1;i<=10;i++) {
			if(i%3!=0) continue;
			sum+=i;
		}
		System.out.println("1-10까지 합계는"+sum);
		
	}

}
