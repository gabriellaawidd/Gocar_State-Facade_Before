package models;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Driver {
	
	private String name;
	private int speed;
	private static final List<String> DriversList = Arrays.asList(
			"Shanon", "Kenzi", "Geoffrey", "Johanna",
			"Andoko", "Nadja", "Marcel", "Hanif"
	);
	Random rand = new Random();

	public Driver() {
		this.name = DriversList.get(rand.nextInt(DriversList.size()));
		this.speed = rand.nextInt(5) + 1;
	}

	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}

	public static List<String> getDriverslist() {
		return DriversList;
	}

}
