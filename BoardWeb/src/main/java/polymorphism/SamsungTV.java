package polymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===>SamsungTV) 객체 생성");
	}
	
	//생성자 의존성 주입
	/*public SamsungTV(Speaker speaker) {
		System.out.println("===>SamsungTV(2); 객체 생성");
		this.speaker=speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
				this.speaker=speaker;
				this.price=price;
	}*/
	
	//Setter 인젝션 사용하기
	public void setSpeaker(Speaker speaker) {
		System.out.println("===>setSpeaker() 호출");
		this.speaker=speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price=price;
	}
	
	public void initMehod() {
		System.out.println("객체 초기화 작업 처리..");
	}
	
	//객체를 삭제하기 직전에 호출될 임의의 메소드
	public void destroyMehod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리...");;
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---전원 켠다. (가격 : "+price+")");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---전원 끈다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumeDown();
	}
}
