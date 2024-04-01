package am;

public class ChildEx3 extends ParentEx3 {

	@Override // Annotation : 기능을 가진 주석
	public void setMsg(String newMsg) {
		// 부모의 함수를 재정의했으므로
		// 현재 자식의 함수가 우선시된다.
		msg = "Child :  \t" + newMsg;
	}	
	

}
