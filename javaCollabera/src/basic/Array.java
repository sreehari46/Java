package basic;

public class Array {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9};
		System.out.println(a[2]);
		System.out.println(a.length);
		//System.out.println(s[10]);//arrayIndexOutOfBoundException
		System.out.println(a[a.length-5]);
		//System.out.println(a[a.length]);//arrayIndexOutOfBoundException
		System.out.println(a[0]);//null pointer

		
	}

}

