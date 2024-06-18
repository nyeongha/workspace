package basic04.control;

import java.util.Scanner;

public class ss {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=switch(n) {	//향상된 swich_case문
		case 1,3->"남자";
		case 2,4->"여자";
		default->"에러";
		};
		System.out.println(str);
	}

}
