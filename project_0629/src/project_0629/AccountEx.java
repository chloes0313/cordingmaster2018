package project_0629;

public class AccountEx {
	public static void main(String[] args) {
		Account myAccount = new Account();
		
		//예금
		myAccount.deposit(100000);
		
		//잔고 확인
		System.out.println(myAccount.getBalance());
		
		try {
			myAccount.withdraw(500000);
		} catch (BalanceInsufficientException e) {
			String msg = e.getMessage();			//예외 메시지 얻기
			System.out.println("예외 메시지 : "+ msg);
			e.printStackTrace();					//예외 상세 내용 추척 후 출력
		}
	}
}


