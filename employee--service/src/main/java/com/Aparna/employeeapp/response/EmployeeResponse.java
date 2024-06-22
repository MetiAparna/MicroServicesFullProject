package com.Aparna.employeeapp.response;

public class EmployeeResponse {
	
	
	private Long id;
	private String ename;
	private String email;
	private String bloodgroup;
	
	private AddressResponse addressResponse;
	
	
	public AddressResponse getAddressResponse() {
		return addressResponse;
	}
	public void setAddressResponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	@Override
	public String toString() {
		return "EmployeeResponse [id=" + id + ", ename=" + ename + ", email=" + email + ", bloodgroup=" + bloodgroup
				+ "]";
	}


}
