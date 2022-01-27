package method_shadowing;

public class Driver {

	public static void main(String[] args) {
		B b1=new B();
		b1.A1();
		B a1=b1;
		a1.A1();

	}

}
