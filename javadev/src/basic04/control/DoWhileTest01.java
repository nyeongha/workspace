package basic04.control;

public class DoWhileTest01 {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=1000)
		{
			if(i%3==0){
				sum+=i;
				}
			i++;
		}
		System.out.println(sum);
	}

}
