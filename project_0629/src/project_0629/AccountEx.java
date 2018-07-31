package project_0629;

public class AccountEx {
	public static void main(String[] args) {
		Account myAccount = new Account();
		
		//����
		myAccount.deposit(100000);
		
		//�ܰ� Ȯ��
		System.out.println(myAccount.getBalance());
		
		try {
			myAccount.withdraw(500000);
		} catch (BalanceInsufficientException e) {
			String msg = e.getMessage();			//���� �޽��� ���
			System.out.println("���� �޽��� : "+ msg);
			e.printStackTrace();					//���� �� ���� ��ô �� ���
		}
	}
}


