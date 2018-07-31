package project_0629;

public class AnimalEx {
	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		Animal dog = new Dog();			//자동 타입 변환
		Animal cat = new Cat();			//자동 타입 변환
		
		//메서드의 다형성
		dog.sound();
		cat.sound();

		//메서드의 다형성
		Animal.animalSount(dog);
		Animal.animalSount(new Cat());
	}
}

