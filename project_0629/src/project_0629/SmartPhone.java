package project_0629;

public class SmartPhone extends Phone {
	//생성자
	SmartPhone(String owner){
		super(owner);
	}
	
	//메서드
	void openApp(String app) {
		System.out.printf("[%s]앱을 실행합니다.\n", app);
	}
}


