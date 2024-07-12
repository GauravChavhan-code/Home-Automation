package com.CaseStudyTwo;

import java.util.ArrayList;
import java.util.List;

public class Room {
	
	String roomType;
	List<Switchable>devices;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public Room(String roomType) {
		super();
		this.roomType = roomType;
		this.devices = new ArrayList<Switchable>();
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public List<Switchable> getDevices() {
		return devices;
	}

	public void setDevices(List<Switchable> devices) {
		this.devices = devices;
	}
	
	public void addDevice(Switchable device)
	{
		devices.add(device);
	}
	
	

}
