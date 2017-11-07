//Brian Sarsfield (COM1-C)

public class Ex1 {

	public static void main(String[] args) {
		// Calculate the distance a car travels in a given time.
		
		int distance;
		final int SPEED;
		int time;
		
		SPEED = 60;
		
		time = 5;
		distance = SPEED * time;
		System.out.println("The distance traveled for 5 hours :" + distance + " miles.");
		
		time = 8;
		distance = SPEED * time;
		System.out.println("The distance traveled for 8 hours :" + distance + " miles.");
		
		time = 12;
		distance = SPEED * time;
		System.out.println("The distance traveled for 12 hours :" + distance + " miles.");

	}

}
