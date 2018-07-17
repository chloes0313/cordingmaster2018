package project_0629;

public class KumhoTire extends Tire{
	static final int KUMHO_MAX_ROTATION = 15;
	
	//생성자
	KumhoTire(String location, int accumulatedRotation){
		super(location, accumulatedRotation);
		this.maxRotation = KUMHO_MAX_ROTATION;
	}

	@Override
	public boolean rotate() {
		boolean flag = true;
		
		++accumulatedRotation;	//누적 회전수 +1
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : " 
								+ (maxRotation - accumulatedRotation) + "회");
		} else {
			System.out.println("!!!!!--" + location + " KumhoTire가 펑크남--!!!!!");
			flag = !flag;
		}
		
		return flag;
	}
}




