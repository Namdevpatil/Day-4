package programs1;

public class Test {

	//access-modifier non-access-modifier return-type method-name(parameters)
	public static void main(String[] args) {
		
		Product product = new Product();//object/instance creation statement
		//int age = 35;
		
		product.setId(202);
		
		System.out.println(product.getId());//The field Product.id is not visible
		
		System.out.println("====================================");
		
		Gyan gyan = new Gyan("Gyaneshwar", "USA");
		
		//gyan.setName();
		//gyan.setAddress();	
		
		System.out.println(gyan.getName());
		System.err.println("Hello bad boys...!");

	}

}
