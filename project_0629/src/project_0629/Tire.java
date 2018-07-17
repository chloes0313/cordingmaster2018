package project_0629;

public class Tire {
	static final int MAX_ROTATION = 10;
	//멤버변수
	public int maxRotation;			//최대 회전수 (타이어 수명)
	public int accumulatedRotation;	//누적 회전수 
	public String location;			//타이어 위친
	
	//생성자(타이어 위치와, 최대 회전수 초기화)
	public Tire(String location, int accumulatedRotation) {
		this.location = location;
		this.accumulatedRotation = accumulatedRotation;
		maxRotation = MAX_ROTATION;
	}
	
	//메서드
	public boolean rotate() {
		boolean flag = true;
		
		++accumulatedRotation;	//누적 회전수 +1
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 타이어 수명 : " + (maxRotation - accumulatedRotation) + "회");
		} else {
			System.out.println("!!!!!--" + location + " 타이어가 펑크남--!!!!!");
			flag = !flag;
		}
		
		return flag;
	}
}


