package project_0629;

public class Phone {
	//멤버 변수
	String model;
	String color;
	
	//생성자 (생략 시 기본 생성자 자동 생성)
	Phone(){
	}
	
	
	Phone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	//메서드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void call(String phoneNumber) {
		System.out.printf("%s으로 전화를 겁니다.\n", phoneNumber);
	}
}



