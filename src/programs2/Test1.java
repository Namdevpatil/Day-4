package programs2;

public class Test1 {

	public static void main(String[] args) {
		
		
		Mobile mobile1 = new Mobile(1010, "Iphone 15", 167920.00);
		Mobile mobile2 = new Mobile(4984, "Iphone 12", 147920.00);
		Mobile mobile3 = new Mobile(2002, "Iphone 14", 127920.00);
		Mobile mobile4 = new Mobile(3776, "Iphone 10", 107920.00);
		Mobile mobile5 = new Mobile(1122, "Iphone 8", 67920.00);
		
		/*
		 * Mobile mobiles[] = new Mobile[5];//array of mobiles/values mobiles[0] =
		 * mobile1; mobiles[1] = mobile2; mobiles[2] = mobile3; mobiles[3] = mobile4;
		 * mobiles[4] = mobile5;
		 */
		
		Mobile mobiles[] = {mobile1, mobile2, mobile3, mobile4, mobile5};
		
		System.out.println("size/length: "+mobiles.length);
		
		System.out.println("===========================");

		for(Mobile mobile: mobiles)
		{
			System.out.println(mobile.getImei());
			System.out.println(mobile.getBrand());
			System.out.println(mobile.getPrice());
			System.out.println("---------------------");
		}
		

	}

}
