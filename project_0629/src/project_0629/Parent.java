package project_0629;

class Parent {
	void method1() { 
		System.out.println("method1 �Դϴ�."); 
	}
	
	void method2() { 
		System.out.println("method2 �Դϴ�.");  
	}
}

class Child extends Parent{
	
	@Override
	void method2() { 
		System.out.println("�������̵��� method2 �Դϴ�.");  
	}
	
	void method3() { 
		System.out.println("method3 �Դϴ�.");
		method2();
		super.method2();
	}
}
