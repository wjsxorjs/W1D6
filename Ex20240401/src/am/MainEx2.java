package am;

public class MainEx2 {

	public static void main(String[] args) {
		
		// 자식클래스 생성
		ChildEx2 ch1 = new ChildEx2();
		ParentEx2 ch2 = new ChildEx2();
		ParentEx2 ch3 = new ParentEx2();
		
		ch1.print(ch1.msg);  // 재정의된 함수는
							 // 우선순위를 재정의된 자식클래스의 함수가 우선한다.
							 // 어떤 상황에서든 부모클래스의 함수는 Hidden 처리가 된다. (= 숨겨진다.)
		
		ch2.print(ch2.msg);  // 자식클래스로 정의하고 범위를
							 // 부모클래스로만 잡아도 자식클래스에 있는 재정의된 함수를 사용하게 된다.
		
		ch3.print(ch3.msg);	 // 부모클래스로 정의하고 부모클래스로 범위를 잡으면
							 // 자식클래스가 없는 것이나 마찬가지이므로
							 // 재정의가 되어있든 있지않았든 자신의 것만 사용한다.
		
		// 변수는 재정의하였든 하지않았든 자신이 선언한 자료형의 범위(부모 혹은 자식)의 변수를 사용한다.
		
		
	}

}
