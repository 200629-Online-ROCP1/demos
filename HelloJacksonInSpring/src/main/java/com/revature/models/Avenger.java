package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames= {"supName","fName","lName"}))
public class Avenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String supName;
	private String supPower;
	private String fName;
	private String lName;
	private int pLevel;
	
	@ManyToOne
	private Home home;

	public Avenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avenger(int id, String supName, String supPower, String fName, String lName, int pLevel, Home home) {
		super();
		this.id = id;
		this.supName = supName;
		this.supPower = supPower;
		this.fName = fName;
		this.lName = lName;
		this.pLevel = pLevel;
		this.home = home;
	}

	public Avenger(String supName, String supPower, String fName, String lName, int pLevel, Home home) {
		super();
		this.supName = supName;
		this.supPower = supPower;
		this.fName = fName;
		this.lName = lName;
		this.pLevel = pLevel;
		this.home = home;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
		result = prime * result + id;
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + pLevel;
		result = prime * result + ((supName == null) ? 0 : supName.hashCode());
		result = prime * result + ((supPower == null) ? 0 : supPower.hashCode());
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
		Avenger other = (Avenger) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (home == null) {
			if (other.home != null)
				return false;
		} else if (!home.equals(other.home))
			return false;
		if (id != other.id)
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (pLevel != other.pLevel)
			return false;
		if (supName == null) {
			if (other.supName != null)
				return false;
		} else if (!supName.equals(other.supName))
			return false;
		if (supPower == null) {
			if (other.supPower != null)
				return false;
		} else if (!supPower.equals(other.supPower))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getSupPower() {
		return supPower;
	}

	public void setSupPower(String supPower) {
		this.supPower = supPower;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getpLevel() {
		return pLevel;
	}

	public void setpLevel(int pLevel) {
		this.pLevel = pLevel;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	@Override
	public String toString() {
		return "Avenger [id=" + id + ", supName=" + supName + ", supPower=" + supPower + ", fName=" + fName + ", lName="
				+ lName + ", pLevel=" + pLevel + ", home=" + home + "]";
	}
	
	 

}
