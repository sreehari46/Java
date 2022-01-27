package Abstract;

public class Driver {

	public static void main(String[] args) {
		N n1=new N();
		n1.A();
		n1.A1();
		n1.A2();
		M m1=n1;//up casting
		m1.A2();
		m1.A();
		m1.A1();

	}

}
