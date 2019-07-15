package com.visa.prj.entity;

import com.visa.prj.annotations.Column;
import com.visa.prj.annotations.Table;

@Table(name="products")
public class Product implements Comparable<Product>{
	private int id;
	private String name;
	private double price;
	private String categoy;
	private int count;
	
	@Override
	public int compareTo(Product o) {
		
		return this.id-o.id;
	}

	public Product(int id, String name, double price, String categoy, int count) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.categoy = categoy;
		this.count = count;
	}

	@Column(name="prd_id", type="NUMERIC(12)")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="prd_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategoy() {
		return categoy;
	}

	public void setCategoy(String categoy) {
		this.categoy = categoy;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", categoy=" + categoy + ", count=" + count
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
