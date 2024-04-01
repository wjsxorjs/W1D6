package pm;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWin implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// 창이 열렸을 때
		System.out.println("창이 열렸습니다.");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 창의 X버튼 클릭할 때마다 수행(호출)하는 곳
		System.out.println("창을 닫습니다.");
		System.exit(0); // 바로 프로그램 종료
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 닫혔습니다.");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 최소화됐습니다.");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 다시 열렸습니다.");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 활성화됐습니다.");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 비활성화됐습니다.");

	}

}
