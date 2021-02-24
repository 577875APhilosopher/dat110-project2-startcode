package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {
	private String unsubscribeTo;
	
	// Implement object variables - a topic is required
	
	public UnsubscribeMsg(String user, String unsubscribeTo) {
		super(MessageType.UNSUBSCRIBE, user);
		this.unsubscribeTo = unsubscribeTo;
	}

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public String getUnsubscribeTo() {
		return unsubscribeTo;
	}
	
	public void setUnsubscribeTo(String unsubscribeTo) {
		this.unsubscribeTo = unsubscribeTo;
	}
	
	@Override
	public String toString() {
		return super.toString() + " unsubscribe to: " + this.unsubscribeTo;
	}
}
