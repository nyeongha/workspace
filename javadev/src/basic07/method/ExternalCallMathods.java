package basic07.method;

public class ExternalCallMathods {
	public static void main(String[] args) {
		Aa a=new Aa();
		a.print();
		int k=a.data();
		a.data();
		System.out.println(k);
		double result=a.sum(3, 5.2);
		System.out.println(result);
		a.printMonth(5);
		a.printMonth(15);
	}
	

}

class Aa{
	void print() {
		System.out.println("안녕");
		
	}
	int data() {
		return 3;
		
	}
	double sum(int a,double b) {
		return a+b;
	}
	
	void printMonth(int m) {
		if(m<0||m>12) {
			System.out.println("잘못된 입력");
			return;
			
		}
		System.out.println(m+"월 입니다.");
	}
}
