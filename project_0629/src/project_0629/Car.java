package project_0629;

public class Car {
	//�������
	Tire[] tires = {
		new Tire("�տ���", 6),
		new Tire("�տ�����", 2),
		new Tire("�ڿ���", 8),
		new Tire("�ڿ�����", 4)
	};
		
	//������(������ ����Ʈ ������ �ڵ� ����)
	
	//�޼���
	int run() {
		int result = 0;
		
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].rotate() == false) {
				result = i+1;
				stop();
			}
		}
		
		return result;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}

/*
Tire frontLeftT = new Tire("�տ���", 6);
Tire frontRightT = new Tire("�տ�����", 2);
Tire backLeftT = new Tire("�ڿ���", 8);
Tire backRightT = new Tire("�ڿ�����", 4);
*/

