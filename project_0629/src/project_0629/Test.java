package project_0629;

public class Test {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		
		t.color = "»¡°­";
		t.size = 30;
		t.volume = 15;
		t.channel = 13;

		t.turnOn();
		
	}

}

class Tv{
	
	String color;
	int size;
	int volume;
	int channel;

	void turnOn() {
		int temp = 0;
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}
}
