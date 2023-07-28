package com.student;
import javax.persistence.*;

// Entity is declare to make this class an object for the
// database
@Entity
// By default hibernate will name the table Student as class
// name but @Table annotation override it to students
@Table(name = "students")
public class Student {
	// @id make stuid as a primary key and @GeneratedValue
	// auto increment
	@Id
	@GeneratedValue
	// This will override and make column name id in place
	// of stuid
	@Column(name = "id")
	private int stuid;
	// This will override and make column name full name in
	// place of name
	@Column(name = "Full_name") private String name;
	// This will override and make column name Age in place
	// of age
	@Column(name = "Age") private int age;
	// This will override and make column name Department in
	// place of stream
	@Column(name = "Department") private String stream;

	// Basic getters and setters to set and get values
	public int getStuid() { return stuid; }

	public void setStuid(int stuid) { this.stuid = stuid; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }

	public String getStream() { return stream; }

	public void setStream(String stream)
	{
		this.stream = stream;
	}
}
