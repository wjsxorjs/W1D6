package pm;

public interface InterEx1 { // 하위클래스가 반드시 재정의해야한다는 목적이 있다. < 이를 구현(Implements)한다고 한다.
	
	// Interface : 중개자. A와 B 사이에서 중개하는 역할
	
	// 변수 선언 불가
	// 상수 혹은 추상메소드(함수)드만 존재할 수 있음
	
	/*final*/ int value = 100;	// 앞에 final을 생략하더라도 컴파일러가 자동으로 앞에 final을 붙여준다.
							// 상수
	
	public int sum(int n);	// 컴파일러에 의하여 앞에 abstract가 생략됨
	// Interface는 절대 일반 함수를 가질 수 없다. 그래서 abstract를 생략가능한 것이다.
	/*
		public void test(){
			System.out.println("Hello, World!");
		}
	*/
	
	public void 게살볶음밥();
	public void 짜장면();
	public void 짬뽕();
	public void 탕수육();
	
}
