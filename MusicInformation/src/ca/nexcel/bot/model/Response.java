package ca.nexcel.bot.model;

public class Response {
	
	private Recipient recipient;
	private String message;
	
	public Recipient getRecipient() {
		return recipient;
	}
	public String getMessage() {
		return message;
	}
	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
