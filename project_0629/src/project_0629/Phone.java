package project_0629;

public abstract class Phone {
	//멤버 변수
	String owner;
	
	//생성자 (생략 시 기본 생성자 자동 생성)
	Phone(String owner){
		this.owner = owner;
	}
	
	//메서드
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}



