package car_showRoom;

public abstract class car {

	protected String car_name;
	protected String car_brand;
	protected double price;
	protected String body_type;
	public abstract void print_car_details();

	public car() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public car(String car_name, String car_brand, double price, String body_type) {
		super();
		this.car_name = car_name;
		this.car_brand = car_brand;
		this.price = price;
		this.body_type = body_type;
	}


	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getCar_brand() {
		return car_brand;
	}

	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBody_type() {
		return body_type;
	}

	public void setBody_type(String body_type) {
		this.body_type = body_type;
	}
	
	

}
