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
			
			System.out.println("접근 가능한 배열의 길이를 초과하거나 숫자로 바꿀 수 없는 문자열 형태입니다.");
			
		} catch (Exception e) {
			
			System.out.println("알수 없는 예외가 발생했습니다.");
		}
	}
	
	
	
	public void method() throws ClassNotFoundException {
			methodThrowsException();
	}
	
	public void methodThrowsException() throws ClassNotFoundException {
		
		// ClassNotFoundException이 발생 가능한 코드 존재
	}
	
	
}



