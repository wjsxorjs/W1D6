package am;

public class MainEx3 {

	public static void test(ParentEx3 p) {
		p.setMsg("TEST");

	}
	
	
	public static void main(String[] args) {
		
		ParentEx3 pa1 = new ParentEx3();
		
		ParentEx3 pa2 = new ChildEx3();
		
		ParentEx3 pa3 = new GrandChildEx3();
		
		test(pa1);
		System.out.println("ParentEx3 pa1 = new ParentEx3();");
		System.out.println(pa1.msg);
		System.out.println();
		
		test(pa2);
		System.out.println("ParentEx3 pa1 = new ChildEx3();");
		System.out.println(pa2.msg);
		System.out.println();
		
		test(pa3);
		System.out.println("ParentEx3 pa1 = new GrandChildEx3();");
		System.out.println(pa3.msg);
		System.out.println();
		
		
		
		
	}

}
