package basic03.oper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpTest02 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); //System.in은 기본 입력장치 즉, 키보드를 의미
		
		System.out.print("정수 a값입력");
		int a=sc.nextInt();
		
		System.out.print("정수 b값 입력:");
		int b=sc.nextInt();
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		List<Object> list=new ArrayList<>();
		
		sc.close();
	}

}
