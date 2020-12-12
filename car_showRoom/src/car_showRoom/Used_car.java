package car_showRoom;

public class Used_car extends car {

	String owner_name;
	int owner_number;
	int kilometer;

	public Used_car(String owner_name, int owner_number, int kilometer, String car_name, String car_brand, double price,
			String body_type) {
		super();

		this.owner_name = owner_name;
		this.owner_number = owner_number;
		this.kilometer = kilometer;
		this.car_name = car_name;
		this.car_brand = car_brand;
		this.body_type = body_type;
		this.price = price;

	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public int getOwner_number() {
		return owner_number;
	}

	public void setOwner_number(int owner_number) {
		this.owner_number = owner_number;
	}

	public int getKilometer() {
		return kilometer;
	}

	public void setKilometer(int kilometer) {
		this.kilometer = kilometer;
	}

	@Override
	public void print_car_details() {
		System.out.println(" Car name " + car_name + "\n Car Brand is " + car_brand + "\n Car type is "
				+ body_type + "\n Owner Name is " + owner_name + " \n Owner number : " + owner_number
				+ " \n Kilometer : " + kilometer);
	}

}
