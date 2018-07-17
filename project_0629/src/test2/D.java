
package test2;

import test1.A;				//다른 패키지 클래스 A 사용을 위한 import

public class D extends A {
	
	D (){
		super();			// OK. 상속관계로 접근 가능
	}
	
	public void method() {
		//A a1 = new A();		// Error. 직접 접근 불가
		
		var = "상속받은 변수";	// OK. 상속관계로 접근 가능
		method();			// OK. 상속관계로 접근 가능
	}
}


