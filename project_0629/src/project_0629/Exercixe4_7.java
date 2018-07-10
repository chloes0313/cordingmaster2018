package project_0629;

import java.util.Scanner;

public class Exercixe4_7 {
	public static void main(String[] args) {
		/*************************************
		 * while문을 이용하여 예금, 출금, 잔고조회, 종료 기능을 제공하는 코드를 작성해보세요.
		 * 각 기능을 가르키는 번호를 콘솔창으로 입력받습니다.
		 **************************************/
		
		int balance = 0;					// 잔고 저장할 변수 
		int input = 0;						// 콘솔 창에 수를 입력받아 저장할 변수 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1-예금 | 2-출금 | 3-잔고조회 | 0-종료");
			System.out.println("--------------------------------");
			System.out.print("선택메뉴> ");
			
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input == 1) {
				// 예금을 위한 코드를 작성하세요
				
			} else if(input == 2) {
				// 출금을 위한 코드를 작성하세요
				
			} else if(input == 3) {
				// 잔고조회를 위한 코드를 작성하세요
				
			} else if(input == 0) {
				// 종료를 위한 코드를 작성하세요
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}



