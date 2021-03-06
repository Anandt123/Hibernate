package com.jspiders.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class userDetails128 {
	
	@Column(name="id")
	private int userId;
	
	@Column(name="salary")
	private double sal;
    
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	@Id
	private String userName;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Embedded
	private Address homeAddress;

	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	@Embedded
	@AttributeOverrides(value = {@AttributeOverride(name = "city",column = @Column(name="work_city")),
			@AttributeOverride(name = "state",column = @Column(name="work_state")),
			@AttributeOverride(name = "country",column = @Column(name="work_country")),
			@AttributeOverride(name = "pincode",column = @Column(name="work_pincode"))})
	private Address workAddress;
	
	public Address getWorkAddress() {
		return workAddress;
	}
	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	
	
}
