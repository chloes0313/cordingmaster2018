package project_0629;

public class Account {
	//멤버변수
	private long balance;
	
	//생성자 생략
	
	//메서드
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고 부족!");
		} else {
			balance -= money;
		}
	}
}



