package com.bentoi.ai.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblProducts")
public class Products implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	
//	@GeneratedValue
	private String name;
	private String description;
	private Float price;
	private String categorypath;
	private Boolean available;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getCategorypath() {
		return categorypath;
	}
	public void setCategorypath(String categorypath) {
		this.categorypath = categorypath;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	

}
