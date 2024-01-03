package programs3;

public class Test2 {

	public static void main(String[] args) {
		
		
		Mobile mobile1 = new Mobile(1010, "Iphone 15", 167920.00);
		Mobile mobile2 = new Mobile(4984, "Iphone 12", 147920.00);
		Mobile mobile3 = new Mobile(2002, "Iphone 14", 127920.00);//120000.00
		Mobile mobile4 = new Mobile(3776, "Iphone 10", 107920.00);
		Mobile mobile5 = new Mobile(1122, "Iphone 8", 67920.00);
		
		Mobile mobiles[] = {mobile1, mobile2, mobile3, mobile4, mobile5};
		
		System.out.println("===========================================================");

		for(Mobile mobile: mobiles)//modern/enhanced for loop 
		{
			System.out.println(mobile.toString());
			System.out.println("------------------------------------------------------------");
		}
		
		System.out.println("=========================Mobiles having price>=120000.00============================");

		for(Mobile mobile: mobiles)//modern/enhanced for loop 
		{
			if(mobile.getPrice() >= 120000.00)
			{
				System.out.println(mobile.toString());
				System.out.println("------------------------------------------------------------");
			}
			
		}
		
		System.out.println("=========================Mobiles having price<=100000.00============================");

		
		for(Mobile mobile: mobiles)//modern/enhanced for loop 
		{
			if(mobile.getPrice() <= 100000.00)
			{
				System.out.println(mobile.toString());
				System.out.println("------------------------------------------------------------");
			}
			
		}
		
		System.out.println("=========================Mobiles having price<=100000.00============================");

		
		
		for(Mobile mobile: mobiles)//modern/enhanced for loop 
		{
			System.out.println(mobile.getPrice() <= 100000.00);
			
		}
		
	}

}
