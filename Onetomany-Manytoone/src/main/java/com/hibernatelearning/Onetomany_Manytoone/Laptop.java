package com.hibernatelearning.Onetomany_Manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String name;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "laptop")
	private List<student> students =  new ArrayList<student>();
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<student> getStudents() {
		return students;
	}
	public void setStudents(List<student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", name=" + name + "]";
	}
	
}
