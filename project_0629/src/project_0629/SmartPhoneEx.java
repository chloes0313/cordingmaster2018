package project_0629;

public class SmartPhoneEx {
	public static void main(String[] args) {
		
		//SmartPhone 객체 생성
		//SmartPhone myPhone = new SmartPhone("아이폰X", "black", "ios");
		SmartPhone myPhone = new SmartPhone();
		
		//Phone클래스로부터 상속 받은 멤버변수
		System.out.println("모델명 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		//SmartPhone클래스의 멤버변수
		System.out.println("운영체제 : " + myPhone.os);
		
		//Phone클래스로부터 상속 받은 메서드 호출
		myPhone.powerOn();
		myPhone.call("010-1234-1234");
		
		//SmartPhone클래스의 메서드 호출
		myPhone.openApp("카카오톡");
	
	}
}



