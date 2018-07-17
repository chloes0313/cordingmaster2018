package project_0629;

public class DriverTest {
	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		d.drive(bus);
		System.out.println("--------------------");
		d.drive(texi);
		
		Vehicle vehicle = bus;
		
	}
}





