package project_0629;

public class SmartPhoneEx {
	public static void main(String[] args) {
		
		//SmartPhone ��ü ����
		//SmartPhone myPhone = new SmartPhone("������X", "black", "ios");
		SmartPhone myPhone = new SmartPhone();
		
		//PhoneŬ�����κ��� ��� ���� �������
		System.out.println("�𵨸� : " + myPhone.model);
		System.out.println("���� : " + myPhone.color);
		//SmartPhoneŬ������ �������
		System.out.println("�ü�� : " + myPhone.os);
		
		//PhoneŬ�����κ��� ��� ���� �޼��� ȣ��
		myPhone.powerOn();
		myPhone.call("010-1234-1234");
		
		//SmartPhoneŬ������ �޼��� ȣ��
		myPhone.openApp("īī����");
	
	}
}



