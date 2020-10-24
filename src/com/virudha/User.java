package com.virudha;

public class User {
	protected int id;
	protected String name;
	protected String email;
	protected String address;
	protected String contactno;
	
	public User() {
	}
	
	public User(String name, String email, String address,String contactno) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.contactno = contactno;
	}

	public User(int id, String name, String email,String address,String contactno ) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.contactno = contactno;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
}