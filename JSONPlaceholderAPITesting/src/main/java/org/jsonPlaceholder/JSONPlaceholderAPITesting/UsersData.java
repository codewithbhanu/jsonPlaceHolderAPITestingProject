package org.jsonPlaceholder.JSONPlaceholderAPITesting;

public class UsersData {
	private int id;
	private String name;
	private String username;
	private String email;
	private AddressData address;
	private String phone;
	private String website;
	private CompanyData company;

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

	public AddressData getAddress() {
		return address;
	}

	public void setAddress(AddressData address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public CompanyData getCompany() {
		return company;
	}

	public void setCompany(CompanyData company) {
		this.company = company;
	}
}
