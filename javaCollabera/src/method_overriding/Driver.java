package method_overriding;

public class Driver {

	public static void main(String[] args) {
		B b1=new B();
		b1.light();
		A a1=new A();
		a1.light();
		A a2=b1;
		a2.light();

	}

}
