package pmTest;

import javax.swing.JFrame;

public class MyFrameTest3 extends JFrame { // 모두 인스턴스 안에 만들어진다.

	public MyFrameTest3() { // 생성자는 반환형이 없다. 인자가 없다면 기본 생성자라고 한다.
		MyInterTest3 mit3 = new MyInterTest3();
		this.setSize(500, 600); // this는 현재 객체를 의미한다.
		this.setTitle("My Frame Test V0.2");
		
		// 창의 X 버튼을 클릭하는 것을 감지하는 이벤트 감지자 등록
		this.addWindowListener(mit3); // this는 자기자신(현재 객체)을 가리킨다. 유일한 방법이다.
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		MyFrameTest3 myFrame = new MyFrameTest3();	// 자료형 변수명 = 새로생성 생성자();
	
	}



}
