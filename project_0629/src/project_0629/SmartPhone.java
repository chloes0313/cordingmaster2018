package project_0629;

public class SmartPhone extends Phone {
	//�������
	String os;
	//���÷��� Ŭ����
	Display dp1 = new RetinaDispaly();
	Display dp2 = new AMOLEDDispaly();
	
	//������
	
	SmartPhone(){
		super();
	}
	
	SmartPhone(String model, String color, String os) {
		super(model, color);
		this.os	= os;
	}
	
	//�޼���
	void openApp(String app) {
		System.out.printf("[%s]���� �����մϴ�.\n", app);
	}
	
	void closeApp(String app) {
		System.out.printf("[%s]���� �����մϴ�.\n", app);
	}
	
}


