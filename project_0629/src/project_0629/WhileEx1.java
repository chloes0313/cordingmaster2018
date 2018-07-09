package project_0629;

public class WhileEx1 {
	public static void main(String[] args) throws InterruptedException {
		/********************************************
		 * 10부터 1까지 카운트다운을 실행하는 코드를 만들어 보자.
		 ********************************************/
		int i = 10;			//카운트다운 시작할 숫자 초기화 
		
		System.out.println("지금부터 카운트 다운을 시작합니다.");
		
		while(i != 0) {
			System.out.println(i--);
			Thread.sleep(1000);				// 시간을 1초씩 지연시키는 구문				
		}
		
		System.out.println("---카운트 다운 끝---");
	}
}


