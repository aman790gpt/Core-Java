package com.CollegeFee;

public class Hosteller extends Student {
	private int roomNumber;
	private char blockName;
	private String roomType;
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public char getBlockName() {
		return blockName;
	}
	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int roomNumber, char blockName, String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber = roomNumber;
		this.blockName = blockName;
		this.roomType = roomType;
	}
	@Override
	public double calculateTotalFee() {
		
		if(blockName == 'A' && roomType.equals("AC")) {
			return (collegeFee + 60000 + 8000);
		}
		
		else if(blockName == 'B'&& roomType.equals("AC")) {
			return (collegeFee + 50000 + 5000);
		}
		
		else if(blockName == 'C'&& roomType.equals("AC")) {
			return (collegeFee + 40000 + 2500);
		}
		else if(blockName == 'A'&& roomType.equals("Non-AC")) {
			return (collegeFee + 60000);
		}
		else if (blockName == 'B'&& roomType.equals("Non-AC")) {
			return (collegeFee + 50000);
		}
		else if(blockName == 'C'&& roomType.equals("Non-AC")) {
			return (collegeFee + 40000);
		}
		else {
			return 0;
		}
		
	}
	
	
}
