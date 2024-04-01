package am;

public class MainEx1 {
	
	public static void test(MyCarEx1 mc) {
//		mc.setMyModel("자동차모델: M1");
		mc.setModel("자동차모델: M1");
	}
	

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 객체 생성
		MyCarEx1 mc1 = new MyCarEx1(); // MyCarEx1 객체 생성
		
		HDCarEx1 mc2 = new HDCarEx1(); // HDCarEx1 객체 생성
		
		/*
			해당 mc1.model를 접근할 때는 MyCarEx1으로부터 찾는다.
			MyCarEx1에 없다면 그 부모 클래스에서 찾는데
			자손클래스부터 조상클래스 모두 같은 변수와 함수를 가질 수 있다.
			위의 경우 가장 처음 접근했던 MyCarEx1의 moel을 접근하고 사용하게 된다.
		*/
		System.out.println(mc1.model); // null
		test(mc1);
		System.out.println(mc1.model); // 자동차모델: M1
		

	}

}
