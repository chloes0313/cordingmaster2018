package project_0629;

public class HankookTire extends Tire{
	static final int HANKOOK_MAX_ROTATION = 17;
	
	//������
	HankookTire(String location, int accumulatedRotation){
		super(location, accumulatedRotation);
		this.maxRotation = HANKOOK_MAX_ROTATION;
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


