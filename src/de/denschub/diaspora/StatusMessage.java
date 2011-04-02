package de.denschub.diaspora;

public class StatusMessage {
	private String _createdAt;
	private String _text;
	private String _user;
	private String _id;
	
	public String getCreatedAt() {
		return this._createdAt;
	}
	
	public void getCreatedAt(String createdAt) {
		this._createdAt = createdAt;
	}
	
	public String getText() {
		return this._text;
	}
	
	public void getText(String text) {
		this._text = text;
	}
	
	public String getUser() {
		return this._user;
	}
	
	public void getUser(String user) {
		this._user = user;
	}
	
	public String getId() {
		return this._id;
	}
	
	public void getId(String id) {
		this._id = id;
	}
}
