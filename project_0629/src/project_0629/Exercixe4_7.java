package project_0629;

import java.util.Scanner;

public class Exercixe4_7 {
	public static void main(String[] args) {
		/*************************************
		 * while���� �̿��Ͽ� ����, ���, �ܰ���ȸ, ���� ����� �����ϴ� �ڵ带 �ۼ��غ�����.
		 * �� ����� ����Ű�� ��ȣ�� �ܼ�â���� �Է¹޽��ϴ�.
		 **************************************/
		
		int balance = 0;					// �ܰ� ������ ���� 
		int input = 0;						// �ܼ� â�� ���� �Է¹޾� ������ ���� 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1-���� | 2-��� | 3-�ܰ���ȸ | 0-����");
			System.out.println("--------------------------------");
			System.out.print("���ø޴�> ");
			
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input == 1) {
				// ������ ���� �ڵ带 �ۼ��ϼ���
				
			} else if(input == 2) {
				// ����� ���� �ڵ带 �ۼ��ϼ���
				
			} else if(input == 3) {
				// �ܰ���ȸ�� ���� �ڵ带 �ۼ��ϼ���
				
			} else if(input == 0) {
				// ���Ḧ ���� �ڵ带 �ۼ��ϼ���
				break;
			}
		}
		
		System.out.println("���α׷� ����");
	}
}



