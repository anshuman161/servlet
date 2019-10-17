package com.bridgelabz.fundooproject.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;


@Entity
@Table(name = "label_list")
public class LabelDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long labelId;
	private String labelName;
	private long userId;

	
	


	public long getLabelId() {
		return labelId;
	}


	public void setLabelId(long labelId) {
		this.labelId = labelId;
	}


	public String getLabelName() {
		return labelName;
	}


	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}

}
