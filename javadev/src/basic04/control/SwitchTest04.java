package basic04.control;

import java.util.Scanner;

public class SwitchTest04 {
	public static void main(String[] args) {
		System.out.print("1-12사이의 숫자 입력:");
		Scanner sc= new Scanner(System.in);
		int key=sc.nextInt();
//		
		String season = switch(key/10) {
		case 3,4,5 ->"봄";
		case 6,7,8 -> "여름";
		case 9,10,11-> "가을";
		case 12,1,2 ->"겨울";
		default -> "잘못입력";
		};
		System.out.println(season);
	}

}
