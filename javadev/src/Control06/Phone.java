package Control06;

public abstract class Phone {
	String owner;
	
	public Phone() {
		super();
	}
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println(owner+"의 전원을 켭니다.");
		
	}
	public void turnOff() {
		System.out.println(owner+"의 전원을 끕니다.");
		
	}
	public abstract void internetSerach();

}
