package am;

public abstract class AbsParentEx4 { // 추상 클래스 abstract는 접근제한자와 자리가 바뀌어도 문제가 없다.
							   // abstract라는 키워드가 있다면 해당 클래스는 미완성인 것으로 인식된다.
	String msg;
	
	
	public void setMsg(String newMsg) {
		msg = newMsg;
	}
	
	public void tmp() {};	   // empty method : 비어있는 함수(메소드) < 반드시 재정의할 필요는 없음
	public abstract void test(); // abstract method : 추상메소드
								   // 부모 클래스가 가지고는 있지만 
								   // 자식클래스가 반드시 재정의해야하는 함수.
	
	// 추상메소드를 한 개라도 가진다면
	// 해당 클래스는 반드시 추상클래스
	// 즉, abstract로 명시해야 한다.
}
