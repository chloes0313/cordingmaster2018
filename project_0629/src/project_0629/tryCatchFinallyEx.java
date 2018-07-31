package project_0629;

public class tryCatchFinallyEx {
	public static void main(String[] args) {
		
		try {
			
			// ArrayIndexOutOfBoundsException 발생 가능 코드
			// NumberFormatException 발생 가능 코드
			// 이 외 Exception 발생 가능 코드
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.getMessage();			// 예외 메시지 얻기
		
		} catch (Exception e) {
			
			e.printStackTrace();	// 예외 상세 내용 추척 후 출력
		} 
		
	}
}



