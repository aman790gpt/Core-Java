package com.CollegeFee;

public class DayScholar extends Student {
	private int busNumber;
	private float distance;

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	

	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int busNumber, float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}

	public double calculateTotalFee() {

		if (distance > 30 && distance <= 40) {
			return (28000 + collegeFee);
		} else if (distance > 20 && distance <= 30) {
			return (20000 + collegeFee);
		} else if (distance > 10 && distance <= 20) {
			return (6000 + collegeFee);
		}

		return 0.0;
	}
}