package project_0629;

public class KumhoTire extends Tire{
	static final int KUMHO_MAX_ROTATION = 15;
	
	//������
	KumhoTire(String location, int accumulatedRotation){
		super(location, accumulatedRotation);
		this.maxRotation = KUMHO_MAX_ROTATION;
	}

	@Override
	public boolean rotate() {
		boolean flag = true;
		
		++accumulatedRotation;	//���� ȸ���� +1
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ���� : " 
								+ (maxRotation - accumulatedRotation) + "ȸ");
		} else {
			System.out.println("!!!!!--" + location + " KumhoTire�� ��ũ��--!!!!!");
			flag = !flag;
		}
		
		return flag;
	}
}




