package com.CollegeFee;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id: ");
		int studentId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student name: ");
		String studentName = sc.nextLine();
		System.out.println("Enter Department name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter gender: ");
		String gender = sc.nextLine();
		System.out.println("Enter category: ");
		String category = sc.nextLine();
		System.out.println("Enter College fee: ");
		double collegeFee = sc.nextDouble();
		
		Student H=null;
		
		if(category.equals("Hosteller")) {
			System.out.println("Enter Room Number: ");
			int roomNumber = sc.nextInt();
			System.out.println("Enter the block Name: ");
			char blockName = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Enter the room type: ");
			String roomType = sc.nextLine();
		   H =new Hosteller(studentId, studentName, departmentName, gender, category,
					collegeFee, roomNumber, blockName, roomType);
		}
		
		else if(category.equals("DayScholar")) {
			System.out.println("Enter Bus number: ");
			int busNumber = sc.nextInt();
			System.out.println("Enter the distance: ");
			int distance = sc.nextInt();
			H =new DayScholar(studentId, studentName, departmentName, gender, category,
					collegeFee,busNumber,distance);
		}
		
		

		System.out.printf("\n%-15s : %s", "Student Id", H.getStudentId());
		System.out.printf("\n%-15s : %s", "Student Name", H.getStudentName());
		System.out.printf("\n%-15s : %s", "Department", H.getDepartment());
		System.out.printf("\n%-15s : %s", "Gender", H.getGender());
		System.out.printf("\n%-15s : %s", "Category", H.getCategory());
		System.out.printf("\n%-15s : %s", "CollegeFee", H.getCollegeFee());
		System.out.println("\n\nTotal Fee :"+H.calculateTotalFee());
	}

}
