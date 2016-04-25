package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class JewelryCategory extends AbstractEntity{
	@Column(name="category_name")
private String categoryName;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
