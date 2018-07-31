package project_0629;

public class ThrowsEx {
	public static void main(String[] args) {
		try {
			checkClass();
		} catch (ClassNotFoundException e) {
			System.out.println("java.lang.Strings 클래스가 존재하지 않습니다.");
		}
	}

	public static void checkClass() throws ClassNotFoundException {
		Class clz = Class.forName("java.lang.Strings");
	}
}


