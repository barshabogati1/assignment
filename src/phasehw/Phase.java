package phasehw;

import java.util.Scanner;

public class Phase {
	
	public static void displayMainMenu() {
		System.out.println(
				"CHOOSE TYPE OF MEAL:\n1.Italian\n2.Chinese\n3.American\n0.Exit\nChoose whta type of food you would like to order.");

	}

	public static void displayItalianFoodMenu() {
		System.out.println("CHOOSE ONE\r\n" + "__________\r\n" + "1. Lasagna Tray - Feeds 5 - 17.99\r\n"
				+ "2. Pizza Pack - Feeds 7 - 15.99\r\n"
				+ "3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99\r\n" + "Enter Choice");

	}

	public static void displayChineseFoodMenu() {
		System.out.println("CHOOSE ONE\r\n" + "__________\r\n"
				+ "1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99\r\n"
				+ "2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99\r\n"
				+ "3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99\r\n" + "Enter Choice");

	}

	public static void displayAmericanFoodMenu() {
		System.out.println("CHOOSE ONE\r\n" + "__________\r\n"
				+ "1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99\r\n"
				+ "2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -\r\n"
				+ "22.99\r\n" + "3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99\r\n"
				+ "Enter Choice");

	}

	public static double determineTrays(int people, int feeds) {
		double num_tray = (double) people / feeds;

		return num_tray;
	}

	public static double getSubtotal(double price, int num_tray) {
		double sub_price = price * num_tray;
		return sub_price;

	}

	public static double getTax(double sub_price, double taxrate) {
		double tax_rate = sub_price * taxrate;
		return tax_rate;

	}

	public static double getTip(double sub_price, double tiprate) {
		double tip_rate = sub_price * tiprate;
		return tip_rate;
	}

	public static double getGrandTotal(double sub_price, double tax_price, double tip_price) {
		double grand_total = sub_price + tax_price + tip_price;
		return grand_total;
	}

	public static double pricePerPerson(double grand_total, int people) {
     double priceperperson= grand_total/people;
     return priceperperson;
	}

	public static int determineLeftOvers(int feeds, int num_tray, int people) {
	  int leftoverservings= (feeds*num_tray)-people;
	  return leftoverservings;
	 }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("Please, Enter the number of customers: ");
			int people = input.nextInt();
			if (people >= 10) {
				System.out.println("Please select the type of food you would like to order from the following Menu: ");
				displayMainMenu();
				String choice = input.next();
				switch (choice) {	
				case "exit":
					flag=false;
					break;
				case "Italian":
				{
					displayItalianFoodMenu();
					System.out.println("Please, choose any food option: ");
					int food_op1 = input.nextInt();
	
					switch (food_op1) {
					case 1: {
						double a = determineTrays(people, 5);
						int num_tray = (int) Math.ceil(a);
	
						double sub_price = getSubtotal(17.99, num_tray);
	
						double tax_price = getTax(sub_price, 7);
	
						double tip_price = getTip(sub_price, 15);
						double grand_total = getGrandTotal(sub_price, tax_price, tip_price);
						double priceperperson = pricePerPerson(grand_total, people);
						int leftoverservings = determineLeftOvers(5,  num_tray,  people );
						System.out.println("You need "+num_tray+ " trays.");
						System.out.println("Feeds:5" );
						System.out.printf("Price for "+ people+ "people and " +num_tray+" trays is: %.2f\n",sub_price);
						System.out.printf("Tax: %.2f\n", tax_price);
						System.out.printf("Tip: %.2f\n",tip_price);
						System.out.printf("Total:  %.2f\n ", grand_total);
						System.out.printf("Price per person:  %.2f\n", priceperperson);
						System.out.println("Leftover servings for the delivery person: "+leftoverservings);
	
						break;
					   }
					case 2: {
						double a = determineTrays(people, 7);
						int num_tray = (int) Math.ceil(a);
						double sub_price = getSubtotal(15.99, num_tray);
	
						double tax_price = getTax(sub_price, 7);
	
						double tip_price = getTip(sub_price, 15);
						double grand_total = getGrandTotal(sub_price, tax_price, tip_price);
						double priceperperson = pricePerPerson(grand_total, people);
						int leftoverservings = determineLeftOvers(7,  num_tray,  people );
						System.out.println("You need "+num_tray+ " trays.");
						System.out.println("Feeds:7" );
						System.out.printf("Price for "+ people+ "people and " +num_tray+" trays is: %.2f\n",sub_price);
						System.out.printf("Tax: %.2f\n", tax_price);
						System.out.printf("Tip: %.2f\n",tip_price);
						System.out.printf("Total:  %.2f\n ", grand_total);
						System.out.printf("Price per person:  %.2f\n", priceperperson);
						System.out.println("Leftover servings for the delivery person: "+leftoverservings);
						break;
					}
					case 3: {
						double a = determineTrays(people, 4);
						int num_tray = (int) Math.ceil(a);
						double sub_price = getSubtotal(12.99, num_tray);
	
						double tax_price = getTax(sub_price, 7);
	
						double tip_price = getTip(sub_price, 15);
						double grand_total = getGrandTotal(sub_price, tax_price, tip_price);
						double priceperperson = pricePerPerson(grand_total, people);
						int leftoverservings = determineLeftOvers(4,  num_tray,  people );
						System.out.println("You need "+num_tray+ " trays.");
						System.out.println("Feeds:4" );
						System.out.printf("Price for "+ people+ "people and " +num_tray+" trays is: %.2f\n",sub_price);
						System.out.printf("Tax: %.2f\n", tax_price);
						System.out.printf("Tip: %.2f\n",tip_price);
						System.out.printf("Total:  %.2f\n ", grand_total);
						System.out.printf("Price per person:  %.2f\n", priceperperson);
						System.out.println("Leftover servings for the delivery person: "+leftoverservings);
						break;
					}
	
					}
					break;
				}
	
				case "Chinese":{
					displayChineseFoodMenu();
					System.out.println("Please, choose any food option: ");
					int food_op2 = input.nextInt();
	
					switch (food_op2) {
					case 1: {
						double a = determineTrays(people, 7);
						int num_tray = (int) Math.ceil(a);
	
						double sub_price = getSubtotal(18.99, num_tray);
	
						double tax_price = getTax(sub_price, 7);
	
						double tip_price = getTip(sub_price, 15);
						double grand_total = getGrandTotal(sub_price, tax_price, tip_price);
						double priceperperson = pricePerPerson(grand_total, people);
						int leftoverservings = determineLeftOvers(7,  num_tray,  people );
						System.out.println("You need "+num_tray+ " trays.");
						System.out.println("Feeds:7" );
						System.out.printf("Price for "+ people+ "people and " +num_tray+" trays is: %.2f\n",sub_price);
						System.out.printf("Tax: %.2f\n", tax_price);
						System.out.printf("Tip: %.2f\n",tip_price);
						System.out.printf("Total:  %.2f\n ", grand_total);
						System.out.printf("Price per person:  %.2f\n", priceperperson);
						System.out.println("Leftover servings for the delivery person: "+leftoverservings);
	
						break;
					}
					case 2: {
						double a = determineTrays(people, 7);
						int num_tray = (int) Math.ceil(a);
						double sub_price = getSubtotal(18.99, num_tray);
	
						double tax_price = getTax(sub_price, 7);
	
						double tip_price = getTip(sub_price, 15);
						double grand_total = getGrandTotal(sub_price, tax_price, tip_price);
						double priceperperson = pricePerPerson(grand_total, people);
						int leftoverservings = determineLeftOvers(7,  num_tray,  people );
						System.out.println("You need "+num_tray+ " trays.");
						System.out.println("Feeds:7" );
						System.out.printf("Price for "+ people+ "people and " +num_tray+" trays is: %.2f\n",sub_price);
						System.out.printf("Tax: %.2f\n", tax_price);
						System.out.printf("Tip: %.2f\n",tip_price);
						System.out.printf("Total:  %.2f\n ", grand_total);
						System.out.printf("Price per person:  %.2f\n", priceperperson);
						System.out.println("Leftover servings for the delivery person: "+leftoverservings);
						break;
					}
					case 3: {
						double a = determineTrays(people, 5);
						int num_tray = (int) Math.ceil(a);
						double sub_price = getSubtotal(10.99, num_tray);
	
						double tax_price = getTax(sub_price, 7);
	
						double tip_price = getTip(sub_price, 15);
						double grand_total = getGrandTotal(sub_price, tax_price, tip_price);
						double priceperperson = pricePerPerson(grand_total, people);
						int leftoverservings = determineLeftOvers(5,  num_tray,  people );
						System.out.println("You need "+num_tray+ " trays.");
						System.out.println("Feeds:5" );
						System.out.printf("Price for "+ people+ "people and " +num_tray+" trays is: %.2f\n",sub_price);
						System.out.printf("Tax: %.2f\n", tax_price);
						System.out.printf("Tip: %.2f\n",tip_price);
						System.out.printf("Total:  %.2f\n ", grand_total);
						System.out.printf("Price per person:  %.2f\n", priceperperson);
						System.out.println("Leftover servings for the delivery person: "+leftoverservings);
						break;
					}
	
					}
					break;
				}
	
				
				case "American":{
					displayAmericanFoodMenu();
					System.out.println("Please, choose any food option: ");
					int food_op3 = input.nextInt();
	
					switch (food_op3) {
					case 1: {
						double a = determineTrays(people, 8);
						int num_tray = (int) Math.ceil(a);
	
						double sub_price = getSubtotal(21.99, num_tray);
	
						double tax_price = getTax(sub_price, 7);
	
						double tip_price = getTip(sub_price, 15);
						double grand_total = getGrandTotal(sub_price, tax_price, tip_price);
						double priceperperson = pricePerPerson(grand_total, people);
						int leftoverservings = determineLeftOvers(8,  num_tray,  people );
						System.out.println("You need "+num_tray+ " trays.");
						System.out.println("Feeds:8" );
						System.out.printf("Price for "+ people+ "people and " +num_tray+" trays is: %.2f\n",sub_price);
						System.out.printf("Tax: %.2f\n", tax_price);
						System.out.printf("Tip: %.2f\n",tip_price);
						System.out.printf("Total:  %.2f\n ", grand_total);
						System.out.printf("Price per person:  %.2f\n", priceperperson);
						System.out.println("Leftover servings for the delivery person: "+leftoverservings);
	
						break;
					}
					case 2: {
						double a = determineTrays(people, 5);
						int num_tray = (int) Math.ceil(a);
						double sub_price = getSubtotal(22.99, num_tray);
	
						double tax_price = getTax(sub_price, 7);
	
						double tip_price = getTip(sub_price, 15);
						double grand_total = getGrandTotal(sub_price, tax_price, tip_price);
						double priceperperson = pricePerPerson(grand_total, people);
						int leftoverservings = determineLeftOvers(5,  num_tray,  people );
						System.out.println("You need "+num_tray+ " trays.");
						System.out.println("Feeds:5" );
						System.out.printf("Price for "+ people+ "people and " +num_tray+" trays is: %.2f\n",sub_price);
						System.out.printf("Tax: %.2f\n", tax_price);
						System.out.printf("Tip: %.2f\n",tip_price);
						System.out.printf("Total:  %.2f\n ", grand_total);
						System.out.printf("Price per person:  %.2f\n", priceperperson);
						System.out.println("Leftover servings for the delivery person: "+leftoverservings);
						break;
					}
					case 3: {
						double a = determineTrays(people, 10);
						int num_tray = (int) Math.ceil(a);
						double sub_price = getSubtotal(26.99, num_tray);
	
						double tax_price = getTax(sub_price, 7);
	
						double tip_price = getTip(sub_price, 15);
						double grand_total = getGrandTotal(sub_price, tax_price, tip_price);
						double priceperperson = pricePerPerson(grand_total, people);
						int leftoverservings = determineLeftOvers(10,  num_tray,  people );
						System.out.println("You need "+num_tray+ " trays.");
						System.out.println("Feeds:10" );
						System.out.printf("Price for "+ people+ "people and " +num_tray+" trays is: %.2f\n",sub_price);
						System.out.printf("Tax: %.2f\n", tax_price);
						System.out.printf("Tip: %.2f\n",tip_price);
						System.out.printf("Total:  %.2f\n ", grand_total);
						System.out.printf("Price per person:  %.2f\n", priceperperson);
						System.out.println("Leftover servings for the delivery person: "+leftoverservings);
						break;
					}
					}
	
					break;
				}
				default:
					System.out.println(" The character or number is invalid.");
					continue;
				}
	
			} else {
				System.out.println("The number is out of range. It should at least be 10.");
				System.out.println("exit");
				input.close();
			}
			
		}

	}

}

