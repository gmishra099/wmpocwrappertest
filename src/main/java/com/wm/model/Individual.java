package com.wm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "individual", schema="salesforce")
public class Individual {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "Name")
    private String name;
    
    @Column(name = "sfid")
    private String indSFID;
    
    @Column(name = "Hasoptedouttracking")
    private String Hasoptedouttracking;
    
    @Column(name = "Shouldforget")
    private String Shouldforget;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndSFID() {
		return indSFID;
	}

	public void setIndSFID(String indSFID) {
		this.indSFID = indSFID;
	}

	public String getHasoptedouttracking() {
		return Hasoptedouttracking;
	}

	public void setHasoptedouttracking(String hasoptedouttracking) {
		Hasoptedouttracking = hasoptedouttracking;
	}

	public String getShouldforget() {
		return Shouldforget;
	}

	public void setShouldforget(String shouldforget) {
		Shouldforget = shouldforget;
	}
    
    

}
