package project_0629;

public class WhileEx1 {
	public static void main(String[] args) throws InterruptedException {
		/********************************************
		 * 10���� 1���� ī��Ʈ�ٿ��� �����ϴ� �ڵ带 ����� ����.
		 ********************************************/
		int i = 10;			//ī��Ʈ�ٿ� ������ ���� �ʱ�ȭ 
		
		System.out.println("���ݺ��� ī��Ʈ �ٿ��� �����մϴ�.");
		
		while(i != 0) {
			System.out.println(i--);
			Thread.sleep(1000);				// �ð��� 1�ʾ� ������Ű�� ����				
		}
		
		System.out.println("---ī��Ʈ �ٿ� ��---");
	}
}


