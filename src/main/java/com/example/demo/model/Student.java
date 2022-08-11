package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
	private Integer stid;
	private String stname;
	private String stage;
	private String stemail;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getStemail() {
		return stemail;
	}
	public void setStemail(String stemail) {
		this.stemail = stemail;
	}
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", stage=" + stage + ", stemail=" + stemail + "]";
	}
	
	
}
