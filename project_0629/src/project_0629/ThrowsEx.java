package project_0629;

public class ThrowsEx {
	public static void main(String[] args) {
		try {
			checkClass();
		} catch (ClassNotFoundException e) {
			System.out.println("java.lang.Strings Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

	public static void checkClass() throws ClassNotFoundException {
		Class clz = Class.forName("java.lang.Strings");
	}
}


