package com.CaseStudyTwo;

public class Light implements Switchable{
	
	boolean status;
	int timeOn;
	
	public Light() {
		// TODO Auto-generated constructor stub
	}

	public Light(boolean status, int timeOn) {
		super();
		this.status = status;
		this.timeOn = timeOn;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getTimeOn() {
		return timeOn;
	}

	public void setTimeOn(int timeOn) {
		this.timeOn = timeOn;
	}

	
	public void tunrOn() {
		if(!status)
		{
			status=true;
		}
		
	}

	
	public void turnOff() {
		if(status)
		{
			status=false;
		}
		
	}

	
	public String getStatus() {
		
		return status? "ON":"OFF";
	}
	
	

}
