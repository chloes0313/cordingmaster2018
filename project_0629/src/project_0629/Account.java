package project_0629;

public class Account {
	//�������
	private long balance;
	
	//������ ����
	
	//�޼���
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ� ����!");
		} else {
			balance -= money;
		}
	}
}



