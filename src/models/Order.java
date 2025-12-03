package models;

public class Order {
	
	private String custName;
	private String pickup;
	private String destination;
	private Driver driver;
	
	public Order(String custName, String pickup, String destination) {
		super();
		this.custName = custName;
		this.pickup = pickup;
		this.destination = destination;
	}

	public String getCustName() {
		return custName;
	}

	public String getPickup() {
		return pickup;
	}

	public String getDestination() {
		return destination;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
