package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {
	private String subscribeTo;
	
	// Implement object variables - a topic is required
	
	public SubscribeMsg(String user, String subscribeTo) {
		super(MessageType.SUBSCRIBE, user);
		this.subscribeTo = subscribeTo;
	}

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public String getSubscribeTo() {
		return subscribeTo;
	}
	
	public void setSubscribeTo(String subscribeTo) {
		this.subscribeTo = subscribeTo;
	}
	
	@Override
	public String toString() {
		return super.toString() + " subscribe to: " + this.subscribeTo;
	}
}
