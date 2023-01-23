package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sample {

	@Id
	private Integer bloodBankID;
	private String bloodGroup;
	private String bloodPressure;
	private String phlevel;
	private boolean active;
	
	public Integer getBloodBankID() {
		return bloodBankID;
	}
	public void setBloodBankID(Integer bloodBankID) {
		this.bloodBankID = bloodBankID;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	
	public String getPhlevel() {
		return phlevel;
	}
	public void setPhlevel(String phlevel) {
		this.phlevel = phlevel;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	} 
	
	
}
