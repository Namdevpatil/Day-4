package programs3;

public class Test1 {

	public static void main(String[] args) {
		
		
		Mobile mobile1 = new Mobile(1010, "Iphone 15", 167920.00);
		Mobile mobile2 = new Mobile(4984, "Iphone 12", 147920.00);
		Mobile mobile3 = new Mobile(2002, "Iphone 14", 127920.00);
		Mobile mobile4 = new Mobile(3776, "Iphone 10", 107920.00);
		Mobile mobile5 = new Mobile(1122, "Iphone 8", 67920.00);
		
		
		Mobile mobiles[] = {mobile1, mobile2, mobile3, mobile4, mobile5};
		
		System.out.println("size/length: "+mobiles.length);
		
		System.out.println("===========================");

		//for(int i=0; condition; update-statement)//traditional for loop
		
		for(Mobile mobile: mobiles)//modern/enhanced for loop 
		{
			System.out.println(mobile.toString());
			System.out.println("------------------------------------------------------------");
		}		

	}

}
