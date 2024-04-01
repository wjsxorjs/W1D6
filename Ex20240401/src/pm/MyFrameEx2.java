package pm;

import javax.swing.JFrame;

public class MyFrameEx2 extends JFrame {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 현재 객체 생성
		MyFrameEx2 myFrame = new MyFrameEx2();
		myFrame.setSize(500, 600); // 창의 너비, 높이 설정
		
		System.out.println(myFrame.getWidth());
		System.out.println(myFrame.getHeight());
		
		myFrame.setTitle("My Frame V0.1");// 창의 타이틀 붙이기
		
		myFrame.setVisible(true); // 보여주기
		
		

	}

}
