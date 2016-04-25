package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Material extends AbstractEntity {
@Column(name="materail_name")
private String materailName;

public String getMaterailName() {
	return materailName;
}

public void setMaterailName(String materailName) {
	this.materailName = materailName;
}

}
