package project_0629;

public class Car {
	//멤버변수
	Tire[] tires = {
		new Tire("앞왼쪽", 6),
		new Tire("앞오른쪽", 2),
		new Tire("뒤왼쪽", 8),
		new Tire("뒤오른쪽", 4)
	};
		
	//생성자(생략시 디폴트 생성자 자동 생성)
	
	//메서드
	int run() {
		int result = 0;
		
		System.out.println("[자동차가 달립니다.]");
		
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].rotate() == false) {
				result = i+1;
				stop();
			}
		}
		
		return result;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

/*
Tire frontLeftT = new Tire("앞왼쪽", 6);
Tire frontRightT = new Tire("앞오른쪽", 2);
Tire backLeftT = new Tire("뒤왼쪽", 8);
Tire backRightT = new Tire("뒤오른쪽", 4);
*/

