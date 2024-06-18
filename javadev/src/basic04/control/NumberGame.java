package basic04.control;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		int h1,h2,h3;
		int c1,c2,c3;
		int s,b;
		int cnt=0;
		
		int n1=(int)(Math.random()*6)+1;
		int n2=(int)(Math.random()*6)+1;
		int n3=(int)(Math.random()*6)+1;
		

		c1 = (int) (Math.random() * 6) + 1;
		
		do {
			c2 = (int) (Math.random() * 6) + 1;
		} while (c2==c1);
		do {
			c3 = (int) (Math.random() * 6) + 1;
		} while (c3==c1||c3==c2);
		
		Scanner sc=new Scanner(System.in);
		do {
			cnt++;
			s=b=0;
			System.out.println("0-9사이의 서로다른 숫자 3개 입력");
			h1=sc.nextInt();
			h2=sc.nextInt();
			h3=sc.nextInt();
			
			if(h1==c1) s++;
			else if(h1==c2||h1==c3) b++;
			
			if(h2==c2) s++;
			else if(h2==1||h2==c3) b++;
			
			if(h3==c3) s++;
			else if(h3==c1||h3==c2) b++;
			
			
		} while (s!=3);
		System.out.println();
		
		
	}

}
