package basic;

public class Constructor {
	String name;
	String brand;
	int cc;
		Constructor(String name,String brand,int cc)
	{
		this.name= name;
		this.brand= brand;
		this.cc= cc;
		System.out.println(this.name);
		System.out.println(this.brand);
		System.out.println(this.cc);
	}

	public static void main(String[] args) {
		
       Constructor b=new Constructor("paulser220","bajaj",30);
       Constructor b1=new Constructor("Gixxer","suzuki",45);

       
	}

}
