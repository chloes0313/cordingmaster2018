package project_0629;

public class SuperAirplaneTest {
	public static void main(String[] args) {
		//��ü ����
		SuperAirplane sa = new SuperAirplane();
		//�޼��� ����
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}


