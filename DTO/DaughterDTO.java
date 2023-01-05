package com.xworkz.dto;

public class DaughterDTO {
	
private String name;
private long mobile;
private int age;
private boolean isMarried;
private boolean isAlive;
private String fatherName;



public DaughterDTO(String name, long mobile, int age, boolean isMarried, boolean isAlive, String fatherName) {
	super();
	this.name = name;
	this.mobile = mobile;
	this.age = age;
	this.isMarried = isMarried;
	this.isAlive = isAlive;
	this.fatherName=fatherName;
}
@Override
public int hashCode() {
	return 23;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	DaughterDTO other = (DaughterDTO) obj;
	if (age != other.age)
		return false;
	if (isAlive != other.isAlive)
		return false;
	if (isMarried != other.isMarried)
		return false;
	if (mobile != other.mobile)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
public String toString() {
	return "DaughterDTO [name=" + name + ", mobile=" + mobile + ", age=" + age + ", isMarried=" + isMarried
			+ ", isAlive=" + isAlive + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isMarried() {
	return isMarried;
}
public void setMarried(boolean isMarried) {
	this.isMarried = isMarried;
}
public boolean isAlive() {
	return isAlive;
}
public void setAlive(boolean isAlive) {
	this.isAlive = isAlive;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}

}