package state;

import models.Order;

public class DriverToCustState implements OrderState {
	
	private Order order;

	public DriverToCustState(Order order) {
		super();
		this.order = order;
	}

	@Override
	public void execute() {
		System.out.println("\n=== Driver Heading to Customer ===");
        System.out.println("Customer: " + order.getCustName());
        System.out.println("Driver " + order.getDriver().getName() + " going at " + order.getDriver().getSpeed() + "km/hour");
        System.out.println("Driver heading to: " + order.getPickup());
		
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public OrderState getNextState() {
		
		return new HeadingLocState(order);
	}


}
