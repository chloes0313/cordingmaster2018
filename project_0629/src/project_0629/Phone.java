package project_0629;

public class Phone {
	//��� ����
	String model;
	String color;
	
	//������ (���� �� �⺻ ������ �ڵ� ����)
	Phone(){
	}
	
	
	Phone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	//�޼���
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	void call(String phoneNumber) {
		System.out.printf("%s���� ��ȭ�� �̴ϴ�.\n", phoneNumber);
	}
}



