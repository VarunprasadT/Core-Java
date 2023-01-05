package com.xworkz.dto;

public class ApplicationDTO {

	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private double price;

	
	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		if (developedBy == null) {
			if (other.developedBy != null)
				return false;
		} else if (!developedBy.equals(other.developedBy))
			return false;
		if (free != other.free)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(version) != Double.doubleToLongBits(other.version))
			return false;
		return true;
	}
	
	public ApplicationDTO() {
		
	}
	
	public ApplicationDTO(String name,double version,boolean free,String developedBy,double price) {
		super();
		this.name=name;
		this.version=version;
		this.free=free;
		this.developedBy=developedBy;
		this.price=price;
	}
	
	
}
