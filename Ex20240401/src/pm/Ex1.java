package pm;

// 하나의 객체가 여러 형태로 나타날 수 있으므로 다형성을 만족한다.
public class Ex1 implements InterEx1 { /*
											Interface는 여러 개를 구현할 수 있다.
									    	해당 Interface를 구현했다는 것은 Interface가
									    	가지고 있는 추상메소드를 모두 재정의했다는 뜻이다.
									    	그렇기에 같은 Interface를 갖고있더라도 재정의 방식에 따라
									    	같은 함수가 수행하는 동작이 서로 다를 수 있다.
									   */

	
	// 재정의를 하는 이유는 상속과 달리 의무에서 온다.
	// 마치 자격증을 따기 위해 합격 조건을 충족시키는 것과 비슷하다.
	@Override
	public int sum(int n) {
		// 구현하겠다고 한 InterEx1의 추상메소드를 재정의한 것
		return value + n;
	}
	
	@Override
	public void 게살볶음밥() {
		System.out.println("게살볶음밥");
	}
	
	@Override
	public void 짜장면() {
		System.out.println("짜장면");
	}
	
	@Override
	public void 짬뽕() {
		System.out.println("짬뽕");
	}
	
	@Override
	public void 탕수육() {
		System.out.println("탕수육 먹고싶다.");
	}

}
