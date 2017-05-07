package exceptions;

import flight.FlightStatus;
import user.OrderStatus;

/**
 *  throws when status has already changed to not UNPUBLISH or TERMINATE but still trying to change something
 *  or the order status unavailable
 */
public class StatusUnavailableException extends Exception {

	public StatusUnavailableException(FlightStatus status) {
		super(status.name());
	}
	
	public StatusUnavailableException(OrderStatus status) {
		super(status.name());
	}
	
	public StatusUnavailableException() {
		super();
	}
	
}
