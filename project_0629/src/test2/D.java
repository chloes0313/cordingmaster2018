
package test2;

import test1.A;				//�ٸ� ��Ű�� Ŭ���� A ����� ���� import

public class D extends A {
	
	D (){
		super();			// OK. ��Ӱ���� ���� ����
	}
	
	public void method() {
		//A a1 = new A();		// Error. ���� ���� �Ұ�
		
		var = "��ӹ��� ����";	// OK. ��Ӱ���� ���� ����
		method();			// OK. ��Ӱ���� ���� ����
	}
}


