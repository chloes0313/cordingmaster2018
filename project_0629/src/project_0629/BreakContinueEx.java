package project_0629;

import java.math.BigDecimal;
import java.util.Scanner;

public class BreakContinueEx {
	public static void main(String[] args) {
		/***************************************************
		 * 1번 부터 3번의 음식 메뉴가 있고 메뉴를 선택하는 프로그램을 만들어보자
		 * 1번은 한식, 2번은 일식, 3번 양식 이라고 정하자
		 * 0번을 입력하면 프로그램을 종료하고, 이외의 숫자 혹은 문자를 입력하면 다시 선택하게 하자 
		 ***************************************************/
		int menu = 0;			// 입력받은 메뉴번호
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("(1) 한식");
			System.out.println("(2) 일식");
			System.out.println("(3) 양식");
			System.out.println("다음 음식 메뉴 중 원하는 번호를 입력하세요. > ");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료했습니다.----------");
				break;
			} else if (menu < 1 || menu > 3 ) {
				System.out.println("해당 메뉴는 존재하지 않습니다.");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 " + menu + "입니다.");
			
		}
	}
}




