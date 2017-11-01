package polymorphism;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	//컨테이너가 SonySpeaker 객체를 speaker 변수에 자동으로 할당
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===>LgTV 객체 생성");
	}
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}
	
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}
