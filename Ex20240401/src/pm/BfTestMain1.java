package pm;

public class BfTestMain1 {

	public static void main(String[] args) {
		
		BfTestChild1 btc1 = new BfTestChild1();
		
		System.out.printf("Current Speed: %d\r\n",btc1.getSpeed());
		btc1.incSpeed();
		btc1.incSpeed();
		btc1.incSpeed();
		System.out.printf("Current Speed: %d\r\n",btc1.getSpeed());
		btc1.decSpeed();
		btc1.decSpeed();
		System.out.printf("Current Speed: %d\r\n",btc1.getSpeed());
		
		
		
		

	}

}
