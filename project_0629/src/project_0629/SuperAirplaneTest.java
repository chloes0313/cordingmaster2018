package project_0629;

public class SuperAirplaneTest {
	public static void main(String[] args) {
		//객체 생성
		SuperAirplane sa = new SuperAirplane();
		//메서드 실행
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}


