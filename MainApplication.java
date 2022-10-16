import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MainApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RailWay railWay = new RailWay();
		String startingStation, destinationStation;
		boolean returnOpinion;
		System.out.println("Enter a starting station : ");
		startingStation = scanner.nextLine();
		System.out.println("Enter a destination station : ");
		destinationStation = scanner.nextLine();
		System.out.println("Would yoy like to book a return ticket?[Y/N] : ");
		returnOpinion = scanner.nextLine().charAt(0) == 'Y' ? true : false;

		railWay.bookTicket(startingStation, destinationStation, returnOpinion);
	}
}