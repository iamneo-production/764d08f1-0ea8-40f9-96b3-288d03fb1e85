package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Donor {

	@Id
	private Integer id;
	private String donorEmail;
	private String phLevel;
	private String bloodPressure;
	private boolean active;
	private String bloodGroup;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDonorEmail() {
		return donorEmail;
	}
	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getPhLevel() {
		return phLevel;
	}
	public void setPhLevel(String phLevel) {
		this.phLevel = phLevel;
	}
}
