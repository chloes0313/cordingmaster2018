package project_0629;

public abstract class Animal {
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	
	public static void animalSount(Animal animal) {
		animal.sound();
	}
}

