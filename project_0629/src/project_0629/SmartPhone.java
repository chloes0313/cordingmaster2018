package project_0629;

public class SmartPhone extends Phone {
	//������
	SmartPhone(String owner){
		super(owner);
	}
	
	//�޼���
	void openApp(String app) {
		System.out.printf("[%s]���� �����մϴ�.\n", app);
	}
}


