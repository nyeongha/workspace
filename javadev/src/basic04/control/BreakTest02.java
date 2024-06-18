package basic04.control;

import java.util.Scanner;

public class BreakTest02 {
	public static void main(String[] args) {
		int n=(int)(Math.random()*100)+1;
		int cnt=0;
		System.out.println(cnt+"1-100:");
		Scanner sc=new Scanner(System.in);
		while(true) {
			int x=sc.nextInt();
			cnt++;
			if(x<n) System.out.println("UP");
			else if(x>n) System.out.println("Down");
			else {
				System.out.println("n은"+x+"였습니다."+cnt+"번 만에 성공하셨습니다.");
				break;}
		}
		
		
	}

}
