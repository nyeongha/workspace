package basic04.control;

public class DoWhileTest02 {
	public static void main(String[] args) {
		int n1,n2;
		n1=(int)(Math.random()*6)+1;

		do {
			n2 = (int) (Math.random() * 6) + 1;
		} while (n1==n2);
		System.out.println(n1+","+n2);
	}

}
