package state;

import models.Order;

public class foundState implements OrderState {
	
	private Order order;

	public foundState(Order order) {
		super();
		this.order = order;
	}

	@Override
	public void execute() {
		System.out.println("\n=== Driver Found ===");
        System.out.println("Customer: " + order.getCustName());
        System.out.println("Driver Found!");
        System.out.println("Driver:" + order.getDriver().getName());
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public OrderState getNextState() {
		
		return new DriverToCustState(order);
	}


}
