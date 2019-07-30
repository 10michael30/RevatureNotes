package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ICE_CREAM")
public class IceCream {
	
	@Id
	@Column(name="Ice_Cream_flavor")
	private String flavor;
	
	@Column(name="Ice_Cream_Description")
	private String descrtiption;
	
	@Column(name="Served_With_Hot_Fudge")
	private boolean servedWithHotFudge;

	public IceCream(String flavor, String descrtiption, boolean servedWithHotFudge) {
		super();
		this.flavor = flavor;
		this.descrtiption = descrtiption;
		this.servedWithHotFudge = servedWithHotFudge;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getDescrtiption() {
		return descrtiption;
	}

	public void setDescrtiption(String descrtiption) {
		this.descrtiption = descrtiption;
	}

	public boolean isServedWithHotFudge() {
		return servedWithHotFudge;
	}

	public void setServedWithHotFudge(boolean servedWithHotFudge) {
		this.servedWithHotFudge = servedWithHotFudge;
	}

	public IceCream() {
		super();
	}
	
	

}