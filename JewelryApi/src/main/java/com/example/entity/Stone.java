package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Stone extends AbstractEntity {
@Column(name="stone_name")
private String stoneName;

public String getStoneName() {
	return stoneName;
}

public void setStoneName(String stoneName) {
	this.stoneName = stoneName;
}

}
