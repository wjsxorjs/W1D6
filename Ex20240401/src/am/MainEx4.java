package am;

public class MainEx4 {
	
	public static void printTest(AbsParentEx4 ap) {
		ap.test();
	}

	public static void main(String[] args) {
		
		// 추상클래스 생성
		// AbsEx4 ab1 = new AbsEx4(); // 추상클래스는 직접생성할 수 없다.
		//						   // 추상클래스는 미완성격으로 판단된다.
		
		
		AbsChildEx4 ace1 = new AbsChildEx4();
		
		ace1.test();
		printTest(ace1);
	}

}
