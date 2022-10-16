import java.util.Map;
import java.util.HashMap;

public class RailWay {

	private Map<String, Integer> stations;

	public RailWay() {
		stations = new HashMap<String, Integer>();
		stations.put("Chennai Beach", 1);
		stations.put("Chennai Fort", 2);
		stations.put("Chennai Park", 3);
		stations.put("Chennai Egmore", 4);
		stations.put("Chetpet", 5);
		stations.put("Nungambakkam", 6);
		stations.put("Kodambakkam", 7);
		stations.put("Mambalam", 8);
		stations.put("Saidapet", 9);
		stations.put("Guindy", 10);
		stations.put("St. Thomas Mount", 11);
		stations.put("Pazhavanthangal", 12);
		stations.put("Meenambakkam", 13);
		stations.put("Trisulam", 14);
		stations.put("Pallavaram", 15);
		stations.put("Chromepet", 16);
		stations.put("Tambaram Sanatorium", 17);
		stations.put("Tambaram", 18);
	}

	public Map<String, Integer> getStations() {
		return stations;
	}


	private double getPrice(String startingStation, String destinationStation, boolean returnOpinion) {
		int distance = getDistace(startingStation, destinationStation);
		double price = 0;
		if(distance <= 5) {
			price = price + 10;
		}
		else if( distance == 17) {
			price = 20;
		}
		else {
			price = price + 10;
			int checkPoints = (distance-5)/5;
			price = price + checkPoints * 5;
			if(distance%5 != 0)
				price = price + 5;
		}

		if(returnOpinion);
			price = 1.75*price;

		return price;
	}

	public void bookTicket(String startingStation, String destinationStation, boolean returnOpinion) {
		double price = getPrice(startingStation, destinationStation, returnOpinion);
		int distance = getDistace(startingStation, destinationStation);
		System.out.println(startingStation + "\n" + destinationStation);
		System.out.println(distance + " stops");
		System.out.println(price + " Rupees");
	}


	private int getDistace(String startingStation, String destinationStation) {
		int startingPosition, destinationPosition;
		startingPosition = stations.get(startingStation);
		destinationPosition = stations.get(destinationStation);
		int distance = Math.abs(startingPosition - destinationPosition);

		return distance;
	}
}