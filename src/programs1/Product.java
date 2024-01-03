package programs1;//custom package name

/*
 * public: access modifier
 * class: used to declare user defined classes
 * Product: user defined class name
 */

public class Product 
{//class starts here
	
	//fields(variables)
	private int id;
	
	public Product() {
		
		id = 300;
	}
	
	//setters and getters method
	
	/**
	 * Method Head/Signature():
	 * Method Body/Implementation:
	 */
	
	
	public int getId()//access-modifier non-access-modifier return-type method-name(parameters) 
	{
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
