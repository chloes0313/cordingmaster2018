package project_0629;

public class ClassCastExceptionEx {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
		if (animal1 instanceof Dog) {
			Dog dog1 = (Dog) animal1;
			System.out.println("--Dog ��ü�� Ÿ�� ��ȯ �Ϸ�!--");
		} else {
			System.out.println("Dog ��ü�� Ÿ�� ��ȯ�� �Ұ��� �մϴ�.");
		}
		
		if (animal2 instanceof Dog) {
			Dog dog2 = (Dog)animal2;
			System.out.println("--Dog ��ü�� Ÿ�� ��ȯ �Ϸ�!--");
		} else {
			System.out.println("Dog ��ü�� Ÿ�� ��ȯ�� �Ұ��� �մϴ�.");
		}
	}
}



