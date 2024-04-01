package pm;

import javax.swing.JFrame;

public class MyFrameEx4 extends JFrame {
	
	MyWin myWin;
	
	public MyFrameEx4() {
		// 기본 생성자
		// 멤버변수 초기화
		
		this.setSize(500, 600);
		this.setVisible(true);
		
		//창 닫기 이벤트 감지자 등록
//		MyWin myWin = new MyWin();
		myWin = new MyWin(); // < 멤버변수 초기화
		this.addWindowListener(myWin); 	// WindowListener를 구현한 객체(Mywin)의 주소(myWin)가 들어가야함
		
//		this.addWindowListener(new MyWin()); // < 이와 같은 코드는 새로 생성한 myWin()을 두 번 다시 사용하지않을 때 한다.
											 //   해당 경우는 사용자가 창을 닫으려고 하는 것이기에 두 번 다시 사용하지 않을 것이다.
											 // + 또한, 계속 새로운 것을 생성하기 때문에 

		
		
	}

	public static void main(String[] args) {
		
		/*MyFrameEx4 mfe4 =*/ new MyFrameEx4();
		
		

	}

}
