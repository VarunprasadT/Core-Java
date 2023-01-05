package com.xworkz.dto;

public class WeaponDTO {

	private String name;
	private String madeBy;
	private WeaponType type;
	private double price;
	private int year;
	
	@Override
	public int hashCode() {
		return 33;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeaponDTO other = (WeaponDTO) obj;
		if (madeBy == null) {
			if (other.madeBy != null)
				return false;
		} else if (!madeBy.equals(other.madeBy))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type != other.type)
			return false;
		if (year != other.year)
			return false;
		return true;
	}


	public WeaponDTO(String name, String madeBy, WeaponType type, double price, int year) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.type = type;
		this.price = price;
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", type=" + type + ", price=" + price + ", year="
				+ year + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMadeBy() {
		return madeBy;
	}
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	public WeaponType getType() {
		return type;
	}
	public void setType(WeaponType type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
		
}
