package project_0629;

class Parent {
	void method1() { 
		System.out.println("method1 입니다."); 
	}
	
	void method2() { 
		System.out.println("method2 입니다.");  
	}
}

class Child extends Parent{
	
	@Override
	void method2() { 
		System.out.println("오버라이딩한 method2 입니다.");  
	}
	
	void method3() { 
		System.out.println("method3 입니다.");
		method2();
		super.method2();
	}
}
