package project_0629;

public class CarTest {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		for(int i = 1 ; i <= 5; i++) {
			int runResult = myCar.run();
			
			switch(runResult) { // 앞쪽 타이어 펑크나면 금호타이어로 바꾸고 뒤쪽은 한국타이어로 바꾼다
				case 1: case 2: 					
					System.out.println(myCar.tires[runResult-1].location+" 타이어 KumhoTire로 교체");
					myCar.tires[runResult-1] = new KumhoTire(myCar.tires[runResult-1].location, 0);
					break;
				case 3: case 4:
					System.out.println(myCar.tires[runResult-1].location+" 타이어 HankookTire로 교체");
					myCar.tires[runResult-1] = new HankookTire(myCar.tires[runResult-1].location, 0);
					break;
			}
			System.out.println("-----------------------------");
		}
	}
}




/*
for(int i = 1 ; i <= 5; i++) {
	int runResult = myCar.run();
	
	switch(runResult) { // 앞쪽 타이어 펑크나면 금호타이어로 바꾸고 뒤쪽은 한국타이어로 바꾼다
		case 1: 					
			System.out.println("앞왼쪽 타이어 KumhoTire로 교체");
			myCar.frontLeftT = new KumhoTire("앞왼쪽", 0);
			break;
		case 2:
			System.out.println("앞오른쪽 타이어 KumhoTire로 교체");
			myCar.frontRightT = new KumhoTire("앞오른쪽", 0);
			break;
		case 3:
			System.out.println("뒤왼쪽 타이어 HankookTire로 교체");
			myCar.backLeftT = new HankookTire("뒤왼쪽", 0);
			break;
		case 4:
			System.out.println("뒤오른쪽 타이어 HankookTire로 교체");
			myCar.backRightT = new HankookTire("뒤오른쪽", 0);
			break;
	}
	System.out.println("-----------------------------");
}*/