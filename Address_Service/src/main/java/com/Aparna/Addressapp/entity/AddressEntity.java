package com.Aparna.Addressapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="address_tbl")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long Zip;
	//@Column(name="emp_tbl_id")
	
	//@OneToOne()
	//@JoinColumn(name="emp_tbl_id")
	private Long emp_tbl_id;
	
	private String lan1;
	
	private String lan2;
	private String state;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getZip() {
		return Zip;
	}
	public void setZip(Long zip) {
		Zip = zip;
	}
	public Long getEmp_tbl_id() {
		return emp_tbl_id;
	}
	public void setEmp_tbl_id(Long emp_tbl_id) {
		this.emp_tbl_id = emp_tbl_id;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
   
}
