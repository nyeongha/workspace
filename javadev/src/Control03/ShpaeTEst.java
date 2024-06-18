package Control03;

public class ShpaeTEst {
	public static void main(String[] args) {
		
		printArea(new Circle());
		printArea(new Triangle());
		printArea(new Rectangle());
	}
	private static void printArea(Shape s) {
		s.area();
		if(s instanceof Circle) {
			Circle c=(Circle) s;
			System.out.println("반지름이 "+c.r+"인 원의 넓이는 "+c.res+"입니다.");
		}
		if(s instanceof Rectangle) {
			Rectangle r=(Rectangle) s;
			System.out.println("너비가 "+r.r+"높이가 "+r.h+"인 사각형의 넓이는"+r.res+"입니다.");
		}
		if(s instanceof Triangle) {
			Triangle t=(Triangle) s;
			System.out.println("너비가 "+t.w+"높이가 "+t.h+"인 삼각형의 넓이는"+t.res+"입니다.");
			
		}
		
		
	}
	

}
