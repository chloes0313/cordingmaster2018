package project_0629;

public class SmartPhone extends Phone {
	//멤버변수
	String os;
	//디스플레이 클래스
	Display dp1 = new RetinaDispaly();
	Display dp2 = new AMOLEDDispaly();
	
	//생성자
	
	SmartPhone(){
		super();
	}
	
	SmartPhone(String model, String color, String os) {
		super(model, color);
		this.os	= os;
	}
	
	//메서드
	void openApp(String app) {
		System.out.printf("[%s]앱을 실행합니다.\n", app);
	}
	
	void closeApp(String app) {
		System.out.printf("[%s]앱을 종료합니다.\n", app);
	}
	
}


