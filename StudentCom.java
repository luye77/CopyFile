﻿
public class StudentCom implements Comparable<StudentCom>{
	private String id;
	private String name;
	private int grade;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public StudentCom() {}
	public StudentCom(String id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	@Override
	public int compareTo(StudentCom o) {
		return this.id.compareTo(o.id);
	}
}
