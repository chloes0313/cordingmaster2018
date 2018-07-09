package project_0629;

import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		/*************************************************
		 *  콘솔화면에서 점수를 입력 받아 A~F 등급을 표시해보자.
		 *  단, 입력받는 숫자는 0~100 사이로 한다.
		 *************************************************/
		
		int score = 0;
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요. (1~100) > ");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();		// 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);		// 입력받은 문자열 tmp를 숫자로 변환

		switch(score/10) {
		case 10: case 9 :
			grade = 'A';
			//break;
		case 8 :
			System.out.println("test");
			grade = 'B';
			//break;
		case 7 :
			System.out.println("test");
			grade = 'C';
			//break;
		default :
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}


