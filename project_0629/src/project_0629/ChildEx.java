package project_0629;

import test1.A;

public class ChildEx {
	public static void main(String[] args) {
		
		Parent p = new Child();		//�ڵ� Ÿ�� ��ȯ
		boolean result = p instanceof Child;
		
		
		System.out.println(result);
		p.field1 = "Parent����";		//OK. �θ� Ŭ���� ����
		p.method1();				//OK. �θ� Ŭ���� �޼���
		p.method2();				//OK. �θ� Ŭ���� �޼���
		
		//p.field2 = "Child����";		//Error. �ڽ� Ŭ���� ����
		//p.method3();				//Error. �ڽ� Ŭ���� �޼���
		
		Child c = (Child) p;		//���� Ÿ�� ��ȯ
		result = c instanceof Child;
		System.out.println(result);
		c.field2 = "Child����";		//OK.
		c.method3();				//OK.
	
		Parent p2 = new Parent();
		Child c3 = (Child) p2;
		result = p2 instanceof Parent;
		System.out.println(result);
		
		Child c2 = new Child();
		result = c2 instanceof Parent;
		System.out.println(result);
	}
}

