package project_0629;

public class tryCatchFinallyEx {
	public static void main(String[] args) {
		
		try {
			
			// ArrayIndexOutOfBoundsException �߻� ���� �ڵ�
			// NumberFormatException �߻� ���� �ڵ�
			// �� �� Exception �߻� ���� �ڵ�
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.getMessage();			// ���� �޽��� ���
		
		} catch (Exception e) {
			
			e.printStackTrace();	// ���� �� ���� ��ô �� ���
		} 
		
	}
}



