package project_0629;

import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		/*************************************************
		 *  �ܼ�ȭ�鿡�� ������ �Է� �޾� A~F ����� ǥ���غ���.
		 *  ��, �Է¹޴� ���ڴ� 0~100 ���̷� �Ѵ�.
		 *************************************************/
		
		int score = 0;
		char grade = ' ';
		
		System.out.print("����� ������ �Է��ϼ���. (1~100) > ");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();		// ȭ���� ���� �Է¹��� ������ tmp�� ����
		score = Integer.parseInt(tmp);		// �Է¹��� ���ڿ� tmp�� ���ڷ� ��ȯ

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
		System.out.println("����� ������ " + grade + "�Դϴ�.");
	}
}


