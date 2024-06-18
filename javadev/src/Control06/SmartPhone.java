package Control06;

public class SmartPhone extends Phone{
	public SmartPhone() {
		super();
	}
	public SmartPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void internetSerach() {
		System.out.println(owner+"의 폰으로 인터넷검색");
		
	}

}
