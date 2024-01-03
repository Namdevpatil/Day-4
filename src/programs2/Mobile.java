package programs2;//custom package name

/*
 * public: access modifier
 */
public class Mobile 
{	
	private long imei;
	private String brand;
	private double price;
	
	public Mobile() {
		
	}

	public Mobile(long imei, String brand, double price) {
		super();
		this.imei = imei;
		this.brand = brand;
		this.price = price;
	}

	public long getImei() {
		return imei;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	
	
	
	
}
