package project_0629;

import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		/******************************************************
		 * 1~100 ������ ������ ���� ������ ���ϴ� ���� answer�� �����ϰ�
		 * 1~100 ���� ���� �ܼ� â���� �Է� �޾� �� ���� answer ���� ��ġ�� ��
		 * ���α׷��� �����ϴ� �ڵ带 �ۼ��غ���.
		 ******************************************************/
		int input = 0;							// �ֿܼ��� �Է� ���� �� ������ ����
		int answer = 0;							// 1~100 ������ ������ ���� �������� ������ ����
		
		answer = (int)(Math.random()*100) + 1;	// ������ ���������� �����Ͽ� �������� ����
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1���� 100���� ������ �Է��ϼ���. > ");
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input > answer) {
				System.out.println("������ "+ input + "���� �۽��ϴ�.");
			} else if(input < answer) {
				System.out.println("������ "+ input + "���� Ů�ϴ�.");
			}
		} while(input != answer);
		
		System.out.println("�����Դϴ�.--------------END");
	}
}
