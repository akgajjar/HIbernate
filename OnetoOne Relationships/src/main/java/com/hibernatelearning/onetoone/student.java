package com.hibernatelearning.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class student {

	@Id
	private int stuid;
	private studentname name;
	@OneToOne
	private Laptop laptop;
	
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public studentname getName() {
		return name;
	}
	public void setName(studentname name) {
		this.name = name;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "student [stuid=" + stuid + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
	
	
}
