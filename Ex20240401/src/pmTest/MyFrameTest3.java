package pmTest;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class MyFrameTest3 extends JFrame implements WindowListener { // 모두 인스턴스 안에 만들어진다.
																   // MyFrameEx3은 JFrame도 되고, WindowListener.

	public MyFrameTest3() { // 생성자는 반환형이 없다. 인자가 없다면 기본 생성자라고 한다.
		
		this.setSize(500, 600); // this는 현재 객체를 의미한다.
		this.setTitle("My Frame V0.2");
		
		// 창의 X 버튼을 클릭하는 것을 감지하는 이벤트 감지자 등록
		this.addWindowListener(this); // this는 자기자신(현재 객체)을 가리킨다. 유일한 방법이다.
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		MyFrameTest3 myFrame = new MyFrameTest3();	// 자료형 변수명 = 새로생성 생성자();
												// 컴파일러가 자동 생성해주며 해당 생성자는 인자가 없다.
		
		

	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// X 버튼을 클릭할 때마다(창이 닫힐때) 수행하는 곳
		// 프로그램 종료시키기
		System.exit(0);
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
