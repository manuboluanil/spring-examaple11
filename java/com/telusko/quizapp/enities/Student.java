package com.telusko.quizapp.enities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	private String stu_name;

	private String stu_Course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getStu_Course() {
		return stu_Course;
	}

	public void setStu_Course(String stu_Course) {
		this.stu_Course = stu_Course;
	}

	public Long getStu_fee() {
		return stu_fee;
	}

	public void setStu_fee(Long stu_fee) {
		this.stu_fee = stu_fee;
	}

	private Long stu_fee;

	@Override
	public String toString() {
		return "Student [id=" + id + ", stu_name=" + stu_name + ", stu_Course=" + stu_Course + ", stu_fee=" + stu_fee
				+ "]";
	}

}
