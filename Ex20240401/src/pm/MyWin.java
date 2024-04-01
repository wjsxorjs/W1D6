package pm;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWin implements WindowListener { // 서로 다른 객체들을 하나로 결집시킬 때 사용
	
	// JAVA에서 객체화 시킬 수 있는 것은 Class, Abstract Class, Interface 이렇게 세 가지이다.
	// 여기서 가장 중요하다고 생각하는 것은 Interface인데, 그 이유는 서로 다른 인스턴스(객체)들인데도
	// 하나로 묶을 수 있기 때문에. 특히, Spring(POJO 기반)에서 자주 쓰이고 중요하게 사용될 것이기 때문이다.

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
