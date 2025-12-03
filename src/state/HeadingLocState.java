package state;

import models.Order;

public class HeadingLocState implements OrderState{
	
	private Order order;
	
	public HeadingLocState(Order order) {
		super();
		this.order = order;
	}

	@Override
	public void execute() {
		System.out.println("\n=== Driver with Customer ===");
        System.out.println("Customer: " + order.getCustName());
        System.out.println("Driver " + order.getDriver().getName() + " going at " + order.getDriver().getSpeed() + "km/hour");
        System.out.println("Heading to: " + order.getDestination());
		
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public OrderState getNextState() {

		return new ArriveState(order);
	}

}
