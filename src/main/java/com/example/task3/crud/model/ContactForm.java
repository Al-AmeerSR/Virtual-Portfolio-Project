package com.example.task3.crud.model;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

//@Entity
public class ContactForm {
//		@Id
//		@GeneratedValue(strategy=GenerationType.IDENTITY)
//		private int id;
	    private String username;
	    private String email;
	    private String message;
	    public ContactForm() {
	    	super();
	    }
	    public  ContactForm (String username,String email,String message) {
	    	
	    	this.username=username;
	    	this.email=email;
	    	this.message=message;
	    	
	    }
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	
}
