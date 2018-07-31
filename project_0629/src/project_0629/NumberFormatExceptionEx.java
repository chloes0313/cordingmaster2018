package project_0629;

public class NumberFormatExceptionEx {
	public static void main(String[] args) {
		String s2 = "200A";
		
		try {
			
			int v2 = Integer.parseInt(s2);
			
		}catch(NumberFormatException e) {
			
			System.out.println("숫자로 바꿀 수 없는 문자열 형태입니다.");
		}
	}
}

