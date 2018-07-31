package project_0629;

public class tryCatchFinallyEx2 {
	public static void main(String[] args) {
		try {
			String[] arr = new String[2];
			arr[0] = "200";
			arr[1] = "15c"; 
			arr[2] = "40";
			
			int v1 = Integer.parseInt(arr[0]);
			int v2 = Integer.parseInt(arr[1]);
			int v3 = Integer.parseInt(arr[2]);
			
			System.out.printf(" %d + %d = %d\n", v1, v2, (v1+v2));
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			
			System.out.println("���� ������ �迭�� ���̸� �ʰ��ϰų� ���ڷ� �ٲ� �� ���� ���ڿ� �����Դϴ�.");
			
		} catch (Exception e) {
			
			System.out.println("�˼� ���� ���ܰ� �߻��߽��ϴ�.");
		}
	}
	
	
	
	public void method() throws ClassNotFoundException {
			methodThrowsException();
	}
	
	public void methodThrowsException() throws ClassNotFoundException {
		
		// ClassNotFoundException�� �߻� ������ �ڵ� ����
	}
	
	
}



