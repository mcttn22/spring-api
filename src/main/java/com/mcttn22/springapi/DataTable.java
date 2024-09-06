package com.mcttn22.springapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DataTable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String data;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}

