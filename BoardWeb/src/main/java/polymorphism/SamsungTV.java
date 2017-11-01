package polymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===>SamsungTV) ��ü ����");
	}
	
	//������ ������ ����
	/*public SamsungTV(Speaker speaker) {
		System.out.println("===>SamsungTV(2); ��ü ����");
		this.speaker=speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) ��ü ����");
				this.speaker=speaker;
				this.price=price;
	}*/
	
	//Setter ������ ����ϱ�
	public void setSpeaker(Speaker speaker) {
		System.out.println("===>setSpeaker() ȣ��");
		this.speaker=speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() ȣ��");
		this.price=price;
	}
	
	public void initMehod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��..");
	}
	
	//��ü�� �����ϱ� ������ ȣ��� ������ �޼ҵ�
	public void destroyMehod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��...");;
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---���� �Ҵ�. (���� : "+price+")");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---���� ����.");
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
