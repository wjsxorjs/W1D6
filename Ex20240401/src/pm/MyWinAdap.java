package pm;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWinAdap extends WindowAdapter {

	// 추상클래스는 상속을 받아 미완성격인 부분을 완성해줘야한다.
	
	@Override
	public void windowClosing(WindowEvent e) {
		// 프로그램 종료
		System.exit(0);
	}
	
}
