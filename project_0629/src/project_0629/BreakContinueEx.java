package project_0629;

import java.math.BigDecimal;
import java.util.Scanner;

public class BreakContinueEx {
	public static void main(String[] args) {
		/***************************************************
		 * 1�� ���� 3���� ���� �޴��� �ְ� �޴��� �����ϴ� ���α׷��� ������
		 * 1���� �ѽ�, 2���� �Ͻ�, 3�� ��� �̶�� ������
		 * 0���� �Է��ϸ� ���α׷��� �����ϰ�, �̿��� ���� Ȥ�� ���ڸ� �Է��ϸ� �ٽ� �����ϰ� ���� 
		 ***************************************************/
		int menu = 0;			// �Է¹��� �޴���ȣ
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("(1) �ѽ�");
			System.out.println("(2) �Ͻ�");
			System.out.println("(3) ���");
			System.out.println("���� ���� �޴� �� ���ϴ� ��ȣ�� �Է��ϼ���. > ");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("���α׷��� �����߽��ϴ�.----------");
				break;
			} else if (menu < 1 || menu > 3 ) {
				System.out.println("�ش� �޴��� �������� �ʽ��ϴ�.");
				continue;
			}
			
			System.out.println("�����Ͻ� �޴��� " + menu + "�Դϴ�.");
			
		}
	}
}




