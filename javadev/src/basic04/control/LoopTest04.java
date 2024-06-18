package basic04.control;

public class LoopTest04 {
	public static void main(String[] args) {
		for(int i=5;i>0;i--) {
			for(int j=i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int x=0;x<6-i;x++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
