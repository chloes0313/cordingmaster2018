package project_0629;

public abstract class Phone {
	//��� ����
	String owner;
	
	//������ (���� �� �⺻ ������ �ڵ� ����)
	Phone(String owner){
		this.owner = owner;
	}
	
	//�޼���
	void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}



