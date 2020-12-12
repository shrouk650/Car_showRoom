package car_showRoom;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Car_test {

	public static void main(String[] args) {

		boolean flag = false;
		String name;
		String brand;
		String type;
		double price_number;
		double speed;
		car[] Cars = new car[1];
		ArrayList<New_car> new_cars = new ArrayList();
		ArrayList<Used_car> used_cars = new ArrayList();
		String selection = JOptionPane.showInputDialog(null,
				"Welcome Please Select: \n  (+)  Add new car" + "\n  ($) sell car \n  (#) Show all cars");
		while (!flag) {
			switch (selection) {
			case "+":
				flag = true;
				String body_type = JOptionPane.showInputDialog(null, "1-New Car     2-Used Car ");
				switch (body_type) {
				case "1":
					name = JOptionPane.showInputDialog("Enter Car name");
					brand = JOptionPane.showInputDialog("Enter Car Brand");
					type = JOptionPane.showInputDialog("Enter Car Type");
					String price = JOptionPane.showInputDialog("Enter Car Price");
					price_number = Double.parseDouble(price);
					String speed_string = JOptionPane.showInputDialog("Enter Car speed");
					speed = Double.parseDouble(speed_string);
					New_car new_car = new New_car(speed, name, brand, price_number, type);
					new_cars.add(new_car);
					break;

				case "2":
					name = JOptionPane.showInputDialog("Enter Car name");
					brand = JOptionPane.showInputDialog("Enter Car Brand");
					type = JOptionPane.showInputDialog("Enter Car Type");
					String price2 = JOptionPane.showInputDialog("Enter Car Price");
					price_number = Double.parseDouble(price2);
					String owenerName = JOptionPane.showInputDialog("Enter Car owner name");
					String owner_number = JOptionPane.showInputDialog("Enter Car owner number");
					int OWnerNumber = Integer.parseInt(owner_number);
					String kilometer = JOptionPane.showInputDialog("Enter Car Kilometer");
					int kilometer_number = Integer.parseInt(kilometer);
					Used_car used_car = new Used_car(owenerName, OWnerNumber, kilometer_number, name, brand,
							price_number, type);
					used_cars.add(used_car);
					break;

				default:
					flag = false;
					body_type = JOptionPane.showInputDialog(null,
							"Invalid Input please select : " + " 1-New Car     2-Used Car ");
					break;
				}
				
				selection = JOptionPane.showInputDialog(
						"Welcome Please Select: \n  (+)  Add new car" + "\n  ($) sell car \n  (#) Show all cars");
				flag = false;
				break;
				
			case "$":
//Enter price and print all cars that match this price or less than.
				String car_price_String= JOptionPane.showInputDialog("Enter price that you want");
				int car_price = Integer.parseInt(car_price_String);
				String State = JOptionPane.showInputDialog(" 1-New Car     2-Used Car ");
				
					flag = true;
					if(State.equals("1")){
						flag = true;
					for(int i= 0 ; i < new_cars.size(); i ++){
						if(new_cars.get(i).getPrice() <= car_price){
							new_cars.get(i).print_car_details();
						}
					}}
					else if(State.equals("2")){
						flag = true;
					for(int i= 0 ; i < used_cars.size(); i ++){
						if(used_cars.get(i).getPrice() <= car_price){
							used_cars.get(i).print_car_details();
						}}
					}
					else {
						JOptionPane.showMessageDialog(null, "Sorry there is no car with the following price");
						selection = JOptionPane.showInputDialog(
								"Welcome Please Select: \n  (+)  Add new car" + "\n  ($) sell car \n  (#) Show all cars");
					}
					
				
				break;
					
			case "#":
				// Print Data
				if (new_cars.size() > 0){
					flag = true;
					for(int i= 0 ; i < new_cars.size(); i ++){
						new_cars.get(i).print_car_details();
					}
					}
				if(used_cars.size()>0){
					flag = true;
						for(int i = 0 ; i < used_cars.size() ; i++){
							used_cars.get(i).print_car_details();
						}
					}
				else {
					JOptionPane.showMessageDialog(null, "There is no product to show");
					selection = JOptionPane.showInputDialog(
							"Welcome Please Select: \n  (+)  Add new car" + "\n  ($) sell car \n  (#) Show all cars");
				}
				
				break;

			default:
				flag = false;
				selection = JOptionPane.showInputDialog(
						"Invalid Input Please Select: \n  (+)  Add new car" + "\n  ($) sell car \n  (#) Show all cars");
				break;
			}
		}

	}
}