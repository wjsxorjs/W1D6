package pm;

import pm.BfTestParent1;

public class BfTestChild1 extends BfTestParent1 {

	
	@Override
	public void incSpeed() {
		if(speed<150) {
			speed+=10;
		}
	};
	
	@Override
	public void decSpeed() {
		if(speed>10) {
			speed-=10;
		}
	};

}
