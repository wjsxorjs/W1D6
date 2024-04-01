package am;

public class ChildEx2 extends ParentEx2 {
	
	public     void    print   (String                                n) { // 재정의를 할 때에는 함수 정의를 똑같이 해야한다.
// 접근제한자 반환형 함수이름(인자 자료형 까지는 동일해야한다. 인자의 변수명은 달라도 상관없다.
		System.out.printf("자식: %s\r\n", n); // < 내용은 다르게 해준다.
	}
	
	
}
