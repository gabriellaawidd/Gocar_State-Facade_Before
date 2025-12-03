package state;

import models.Driver;
import models.Order;

public class findState implements OrderState{

	private Order order;

	public findState(Order order) {
		super();
		this.order = order;
	}

	@Override
	public void execute() {
		System.out.println("\n=== Finding Driver ===");
        System.out.println("Customer: " + order.getCustName());
        System.out.println("Pickup: " + order.getPickup());
        System.out.println("Destination: " + order.getDestination());
        System.out.println("Searching for drivers...");
		
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // Assign Driver
        Driver driver = new Driver();
        order.setDriver(driver);
	}

	@Override
	public OrderState getNextState() {

		return new foundState(order);
	}	
	

}
