package project_0629;

import test1.A;

public class ChildEx {
	public static void main(String[] args) {
		
		Parent p = new Child();		//자동 타입 변환
		boolean result = p instanceof Child;
		
		
		System.out.println(result);
		p.field1 = "Parent변수";		//OK. 부모 클래스 변수
		p.method1();				//OK. 부모 클래스 메서드
		p.method2();				//OK. 부모 클래스 메서드
		
		//p.field2 = "Child변수";		//Error. 자식 클래스 변수
		//p.method3();				//Error. 자식 클래스 메서드
		
		Child c = (Child) p;		//강제 타입 변환
		result = c instanceof Child;
		System.out.println(result);
		c.field2 = "Child변수";		//OK.
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

