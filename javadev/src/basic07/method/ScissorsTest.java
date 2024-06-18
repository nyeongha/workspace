package basic07.method;

import java.util.Scanner;

public class ScissorsTest {
	public static void main(String[] args) {
		String[] caption= {"가위","바위","보"};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("가위는 1, 바위는 2, 보는 3을 입력");
		
		int you=sc.nextInt();
		
		int com=(int)(Math.random()*3+1);
		
		/*
		 you:가위
		 com:보
		 결과:당신의 승리입니다.
		*/
		System.out.println("you:"+caption[you-1]);
		System.out.println("com:"+caption[com-1]);
		
		System.out.println(getMessage(you,com));
	}

	private static String getMessage(int you,int com) {
		switch((you-com+3)%3) {
		case 0:
			return "비겼습니다";
		case 1:
			return "승리입니다.";
		case 2:
			return "패배입니다.";
		default:
			return null;
		}
	}
		
		/*String a;
		if(you==com) {
			
			
			a="비겼습니다.";
			
		}else if((you==1&&com==2)||(you==2&&com==3)||(you==3&&com==1)) {
			a="당신은 졌습니다.";
			
		}else {
			a="당신은 이겼습니다.";
		}
	
//		else if((you==1&&com==3)||(you==2&&com==1)||(you==3&&com==2)) {
//			System.out.println("당신은 이겼습니다.");
//			
//		}
		return a;
		
	}*/
		
	
		
}
