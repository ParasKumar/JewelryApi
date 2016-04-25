package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Caret extends AbstractEntity {
	@Column(name="caret_name")
	private String caretName;

	public String getCaretName() {
		return caretName;
	}

	public void setCaretName(String caretName) {
		this.caretName = caretName;
	}
	

}
