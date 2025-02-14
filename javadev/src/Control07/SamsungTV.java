package Control07;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker=speaker;
		
	}
	public void turnOn() {
		System.out.println("SamsungTV:전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("SamsungTV:전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("SamsungTV:채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("SamsungTV:채널을 내립니다.");
	}
	public void soundUp() {
		if(speaker==null) {
			System.out.println("SamsungTV");
		}else {
			speaker.soundUp();
		}
		System.out.println("SamsungTV:소리를 키웁니다.");
	}
	public void soundDown() {
		if(speaker==null) {
			System.out.println("SamsungTV");
		}else {
			speaker.soundDown();
		}
		System.out.println("SamsungTV:소리를 줄입니다.");
	}


}
