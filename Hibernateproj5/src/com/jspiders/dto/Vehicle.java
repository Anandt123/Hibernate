package com.jspiders.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Vehicle {
	
	@Id
	private int vehicleid;
	private String vehiclename;
	
	@ManyToOne
	private userDetails128 userdetails;
	
	
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getVehiclename() {
		return vehiclename;
	}
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	public userDetails128 getUserdetails() {
		return userdetails;
	}
	public void setUserdetails(userDetails128 userdetails) {
		this.userdetails = userdetails;
	}
	
}
