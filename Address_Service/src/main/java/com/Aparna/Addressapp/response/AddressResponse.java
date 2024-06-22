package com.Aparna.Addressapp.response;

public class AddressResponse {
	
	private Long id;
	private String lan1;
	private String lan2;
	private long zip;
	private String state;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLan1() {
		return lan1;
	}
	public void setLan1(String lan1) {
		this.lan1 = lan1;
	}
	public String getLan2() {
		return lan2;
	}
	public void setLan2(String lan2) {
		this.lan2 = lan2;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressResponse [id=" + id + ", lan1=" + lan1 + ", lan2=" + lan2 + ", zip=" + zip + ", state=" + state
				+ "]";
	}
	
	
	
	
}
