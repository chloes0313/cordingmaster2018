package project_0629;

import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		/******************************************************
		 * 1~100 사이의 임의의 수를 정답을 뜻하는 변수 answer에 저장하고
		 * 1~100 사이 수를 콘솔 창에서 입력 받아 그 수가 answer 값과 일치할 때
		 * 프로그램을 종료하는 코드를 작성해보자.
		 ******************************************************/
		int input = 0;							// 콘솔에서 입력 받은 수 저장할 변수
		int answer = 0;							// 1~100 사이의 임의의 수를 정답으로 저장할 변수
		
		answer = (int)(Math.random()*100) + 1;	// 정답을 랜덤값으로 추출하여 정답으로 저장
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1부터 100사이 정수를 입력하세요. > ");
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input > answer) {
				System.out.println("정답은 "+ input + "보다 작습니다.");
			} else if(input < answer) {
				System.out.println("정답은 "+ input + "보다 큽니다.");
			}
		} while(input != answer);
		
		System.out.println("정답입니다.--------------END");
	}
}
