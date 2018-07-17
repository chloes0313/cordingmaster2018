package project_0629;

public class Tire {
	static final int MAX_ROTATION = 10;
	//�������
	public int maxRotation;			//�ִ� ȸ���� (Ÿ�̾� ����)
	public int accumulatedRotation;	//���� ȸ���� 
	public String location;			//Ÿ�̾� ��ģ
	
	//������(Ÿ�̾� ��ġ��, �ִ� ȸ���� �ʱ�ȭ)
	public Tire(String location, int accumulatedRotation) {
		this.location = location;
		this.accumulatedRotation = accumulatedRotation;
		maxRotation = MAX_ROTATION;
	}
	
	//�޼���
	public boolean rotate() {
		boolean flag = true;
		
		++accumulatedRotation;	//���� ȸ���� +1
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Ÿ�̾� ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
		} else {
			System.out.println("!!!!!--" + location + " Ÿ�̾ ��ũ��--!!!!!");
			flag = !flag;
		}
		
		return flag;
	}
}


