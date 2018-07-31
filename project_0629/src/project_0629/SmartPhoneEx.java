package project_0629;

public class SmartPhoneEx {
	public static void main(String[] args) {
		
		//Phone phone = new Phone("하정우");	//Error. 객체 생성 불가!
		SmartPhone smartPhone = new SmartPhone("하정우");
		
		smartPhone.turnOn();
		smartPhone.openApp("카카오톡");
		smartPhone.turnOff();
	}
}





