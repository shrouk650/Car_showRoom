package car_showRoom;

import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

public class New_car extends car{

	 double speed;
	 

	public New_car(double speed , String car_name , String car_brand , double price , String body_type) {
		
		this.speed = speed;
		this.car_name = car_name;
		this.car_brand = car_brand;
		this.body_type = body_type;
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
		
	}

	@Override
	public void print_car_details() {
		
		System.out.println(" Car name " + car_name + "\n Car Brand is " + car_brand 
				+ "\n Car type is " + body_type + "\n Speed is " + speed);
		
	}


	 
	
}
