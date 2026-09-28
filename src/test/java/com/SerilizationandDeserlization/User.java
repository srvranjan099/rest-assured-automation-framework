package com.SerilizationandDeserlization;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	private String name;
	private String job;
	private String id;
	private String createdAt;
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	
	public String getcreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt=createdAt;
	}
	
	

}
