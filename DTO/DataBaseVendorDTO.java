package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DataBaseVendorDTO implements Serializable {

	
	private String name;
	private String developedBy;
	private enum type;
	private double licenseCost;
	

	public DataBaseVendorDTO() {
		
	}

	public DataBaseVendorDTO(String name, String developedBy, int size, double licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.size = size;
		this.licenseCost = licenseCost;
		
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", licenseCost="
				+ licenseCost +  "]";
	}

	@Override
	public int hashCode() {
		return 35;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataBaseVendorDTO other = (DataBaseVendorDTO) obj;
		
		if (developedBy == null) {
			if (other.developedBy != null)
				return false;
		} else if (!developedBy.equals(other.developedBy))
			return false;
		if (Double.doubleToLongBits(licenseCost) != Double.doubleToLongBits(other.licenseCost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}
}
