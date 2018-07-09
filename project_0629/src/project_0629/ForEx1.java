package project_0629;

public class ForEx1 {
	public static void main(String[] args) {
		/*****************************
		 * 1부터 10까지의 합을 구해 출력하기
		 *****************************/
		
		int sum = 0;					// 합을 저장하기 위한 변수 
		
		for(int i = 1 ; i <= 10; i++) {
			sum = sum + i ;				// sum에 i를 더해 저장한다
		}
		
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}


