package basic04.control;

import java.util.Scanner;

public class SwitchTest03 {
	public static void main(String[] args) {
		System.out.print("0-100사이의 숫자 입력:");
		Scanner sc= new Scanner(System.in);
		int key=sc.nextInt();
//		switch (key/10) {
//		case 9,10: {
//			System.out.println('A');
//			break;
//		}
//		case 8:
//			System.out.println('B');
//			break;
//		case 7:
//			System.out.println('C');
//			break;
//		case 6:
//			System.out.println('D');
//			break;
//		default:
//			System.out.println('F');
//		}
		char grade = switch(key/10) {
		case 10,9 ->'A';
		case 8-> 'B';
		case 7->'C';
		case 6->'D';
		default ->'F';
		};
		System.out.printf("%d학점은 %C학점입니다.\n" ,key,grade);
		sc.close();
	}

}
