package ca.nexcel.bot.model;

public class Message {
	private String mid;
	private String seq;
	private String text;
	
	public String getMid() {
		return mid;
	}
	public String getSeq() {
		return seq;
	}
	public String getText() {
		return text;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public void setText(String text) {
		this.text = text;
	}

}
