package pm;

import javax.swing.JFrame;

public class MyFrameEx5 extends JFrame {
	
	MyWinAdap myWinAdap;
	
	public MyFrameEx5() {
		this.setSize(500, 600); // 창의 크기를 지정.
		this.setLocation(450, 150);
		this.setTitle("My Frame V0.34");
		this.setVisible(true);
		
		myWinAdap = new MyWinAdap();
		
		this.addWindowListener(myWinAdap);
		
	}

	public static void main(String[] args) {
		// 프로그램 시작
		
		new MyFrameEx5();

	}

}
