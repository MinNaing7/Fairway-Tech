
import java.util.Scanner;

public class HotelRegistration {
	public static void main(String[] args) {

		boolean isContinue = true;

		do {
			startRegistration();
			System.out.print("Registration Again? (Y/N) : ");
			Scanner scanner = new Scanner(System.in);
			char response = scanner.next().toLowerCase().charAt(0);

			switch (response) {
				case 'y': 
					isContinue = true;
					break;
				case 'n':
					isContinue = false;
					break;
				default:
					isContinue = false;
			}

		} while (isContinue);
	}

	public static void startRegistration() {

		// Declaration Global Variables

		String customerName, roomType;
		int roomCount, roomPrice, totalPrice;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Customer Name : ");
		customerName = scanner.nextLine();

		// Get Room-Type & Room-Price

		roomType = getRoomType();
		roomPrice = getRoomPrice(roomType);

		System.out.println("------------------------------");

		// Get Room-Count

		System.out.print("Enter Total Room (1,2,3,4,etc...) : ");
		roomCount = scanner.nextInt();

		System.out.println("------------------------------");

		// Calculate Total-Price

		totalPrice = roomPrice * roomCount;

		System.out.println("\b");
		System.out.println("Welcome to Ngapali Hotel");
		System.out.println("\b");

		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("CUSTOMER NAME \t\t ROOM TYPE \t\t TOTAL ROOM \t\t PRICE");
		System.out.println(customerName + " \t\t " + roomType + " \t\t " + roomCount + " \t\t " + totalPrice );
		System.out.println("------------------------------------------------------------------------------------------");

	}

	public static int getRoomPrice(String roomType) {

		int roomPrice;
		switch(roomType) {

			case "Sea View" :
				roomPrice = 120;
				break;

			case "Second Sea View":
				roomPrice = 80;
				break;

			case "Garden View":
				roomPrice = 40;
				break;

			default :
				System.out.println("------------------------------");
				System.out.println("SORRY! SOMETHING WENT WRONG!");
				roomPrice = 0;
		}

		return roomPrice;
	} 

	public static String getRoomType() {

		String roomType;
		Scanner scanner = new Scanner(System.in);

		System.out.println("------------------------------");
		System.out.println("Room Types & Prices");
		System.out.println("------------------------------");
		System.out.println("1 : Sea View - $120");
		System.out.println("2 : Second Sea View - $80");
		System.out.println("3 : Garedn View - $40");
		System.out.println("------------------------------");
		System.out.print("Choose Room Type (1,2,3) : ");
		int roomChoice = scanner.nextInt();

		switch(roomChoice) {

			case 1 :
				roomType = "Sea View";
				break;

			case 2:
				roomType = "Second Sea View";
				break;

			case 3:
				roomType = "Garden View";
				break;

			default :
				System.out.println("------------------------------");
				System.out.println("Invalid Input! Please Try Aagain!");
				roomType = getRoomType(); // Recursive Function

		}

		return roomType;
	}
}

