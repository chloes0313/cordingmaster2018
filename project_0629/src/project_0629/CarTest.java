package project_0629;

public class CarTest {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		for(int i = 1 ; i <= 5; i++) {
			int runResult = myCar.run();
			
			switch(runResult) { // ���� Ÿ�̾� ��ũ���� ��ȣŸ�̾�� �ٲٰ� ������ �ѱ�Ÿ�̾�� �ٲ۴�
				case 1: case 2: 					
					System.out.println(myCar.tires[runResult-1].location+" Ÿ�̾� KumhoTire�� ��ü");
					myCar.tires[runResult-1] = new KumhoTire(myCar.tires[runResult-1].location, 0);
					break;
				case 3: case 4:
					System.out.println(myCar.tires[runResult-1].location+" Ÿ�̾� HankookTire�� ��ü");
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
	
	switch(runResult) { // ���� Ÿ�̾� ��ũ���� ��ȣŸ�̾�� �ٲٰ� ������ �ѱ�Ÿ�̾�� �ٲ۴�
		case 1: 					
			System.out.println("�տ��� Ÿ�̾� KumhoTire�� ��ü");
			myCar.frontLeftT = new KumhoTire("�տ���", 0);
			break;
		case 2:
			System.out.println("�տ����� Ÿ�̾� KumhoTire�� ��ü");
			myCar.frontRightT = new KumhoTire("�տ�����", 0);
			break;
		case 3:
			System.out.println("�ڿ��� Ÿ�̾� HankookTire�� ��ü");
			myCar.backLeftT = new HankookTire("�ڿ���", 0);
			break;
		case 4:
			System.out.println("�ڿ����� Ÿ�̾� HankookTire�� ��ü");
			myCar.backRightT = new HankookTire("�ڿ�����", 0);
			break;
	}
	System.out.println("-----------------------------");
}*/