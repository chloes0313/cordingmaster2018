package project_0629;

public class AnimalEx {
	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		Animal dog = new Dog();			//�ڵ� Ÿ�� ��ȯ
		Animal cat = new Cat();			//�ڵ� Ÿ�� ��ȯ
		
		//�޼����� ������
		dog.sound();
		cat.sound();

		//�޼����� ������
		Animal.animalSount(dog);
		Animal.animalSount(new Cat());
	}
}

