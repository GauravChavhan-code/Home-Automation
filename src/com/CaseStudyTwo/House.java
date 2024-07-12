package com.CaseStudyTwo;

import java.util.List;

public class House {
	
	List<Room>rooms;
	
	public House() {
		// TODO Auto-generated constructor stub
	}

	public House(List<Room> rooms) {
		super();
		this.rooms = rooms;
	}
	
	
	
	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public void addMyRooms(Room room)
	{
		rooms.add(room);
	}
	
	public void turnOnDevice(String roomType,String deviceName)
	{
		for(Room room:rooms)
		{
			if(room.roomType.equals(roomType))
			{
				for(Switchable device:room.devices)
				{
					if(device.devices.equals(deviceName))
					{
						
					}
				}
			}
			{
				
			}
		}
	}

}
