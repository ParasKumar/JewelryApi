package com.example.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.util.JsonDateTimeDeserializer;
import com.example.util.JsonDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * This is an abstract entity class.
 * 
 * @author Santosh
 * @version
 * @since
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

	private static final long serialVersionUID = -2670363051524440713L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "added_date")
	private Date creationDate;

	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modification_date")
	private Date modificationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	/**
	 * <<This method logs modification & creation date of model which inherits
	 * this class.>>
	 * 
	 * @author Santosh Karna
	 * @since 1.0.0 ,Modified In: @version,By @author
	 */
	@PrePersist
	public void creationTimeStamps() {
		creationDate = new Date();
		modificationDate = new Date();
	}

	@PreUpdate
	public void updateTimeStamps() {
		modificationDate = new Date();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime
				* result
				+ ((modificationDate == null) ? 0 : modificationDate.hashCode());
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
		AbstractEntity other = (AbstractEntity) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modificationDate == null) {
			if (other.modificationDate != null)
				return false;
		} else if (!modificationDate.equals(other.modificationDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AbstractEntity [id=" + id + ", creationDate=" + creationDate
				+ ", modificationDate=" + modificationDate + "]";
	}

}
