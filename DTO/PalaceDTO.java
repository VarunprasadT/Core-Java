package com.xworkz.dto;

public class PalaceDTO {
	
	private String name;
	private String location;
	private String builtBy;
	private boolean isDistroyed;
	private float visitingFee;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PalaceDTO other = (PalaceDTO) obj;
		if (builtBy == null) {
			if (other.builtBy != null)
				return false;
		} else if (!builtBy.equals(other.builtBy))
			return false;
		if (isDistroyed != other.isDistroyed)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(visitingFee) != Float.floatToIntBits(other.visitingFee))
			return false;
		return true;
	}
	
	public PalaceDTO() {
	}
	
	public PalaceDTO(String name,String location,String builtBy,boolean isDistroyed,float visitingFee) {
		super();
	this.name=name;
	this.location=location;
	this.builtBy=builtBy;
	this.isDistroyed=isDistroyed;
	this.visitingFee=visitingFee;
	}
	
	@Override
	public String toString() {
		return "PalaceDTO name="+name+"location="+location+"builtBy="+builtBy+"isDistroyed="
				+isDistroyed+"visitingFee="+visitingFee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBuiltBy() {
		return builtBy;
	}
	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}
	public boolean isDistroyed() {
		return isDistroyed;
	}
	public void setDistroyed(boolean isDistroyed) {
		this.isDistroyed = isDistroyed;
	}
	public float getVisitingFee() {
		return visitingFee;
	}
	public void setVisitingFee(float visitingFee) {
		this.visitingFee = visitingFee;
	}
}
