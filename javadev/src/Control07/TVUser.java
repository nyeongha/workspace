package Control07;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception{
		Properties prop=new Properties();
		prop.load(new FileInputStream("src/Control07/product.properties"));
		String tvName=prop.getProperty("tv");
		Class tvClass=Class.forName(tvName);
		TV tv=(TV) tvClass.getConstructor().newInstance();
		
		
		String speakerName=prop.getProperty("Speaker");
		Class speakerClass=Class.forName(speakerName);
		Speaker speaker=(Speaker) speakerClass.getConstructor().newInstance();
		
		
		//TV tv=new LgTV();
		tv.turnOn();
		tv.channelDown();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
	}

}
