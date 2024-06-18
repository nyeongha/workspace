package basic03.oper;

import java.util.Scanner;

public class OpTest10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수입력:");
		int n=sc.nextInt();
		System.out.print(n%2==0?"짝수":"홀수");
		sc.close();
	}
	}


