package Control05;

class AbstarctClass {

	public static void main(String[] args) {

		A a1=new A() {
			void abc() {
				System.out.println("방법2. 익명 이너 클래스 방법으로 객체 생성");
			}
		
	};
		A a2=new A() {
			void abc() {
				System.out.println("방법2. 익명 이너 클래스 방법으로 객체 생성");
			}};
			
			a1.abc();
			a2.abc();
	


}}
