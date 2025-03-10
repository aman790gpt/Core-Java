package com.StoreDepartmental;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the customer name: ");
		String customerName = sc.nextLine();
		
		System.out.println("Enter the phone number: ");
		String phoneNumber = sc.nextLine();
		
		System.out.println("Enter the street name: ");
		String streetName = sc.nextLine();
		
		System.out.println("Enter the bill amount: ");
		double billAmount = sc.nextDouble();
		
		System.out.println("Enter the distance: ");
		int distance = sc.nextInt();
		sc.close();
		
		CustomerDetails customerDetails = new CustomerDetails(customerName, phoneNumber, streetName, billAmount, distance);
		System.out.println(".......Output......\n");
		System.out.println("Customer Name: " + customerDetails.getCustomerName());
		System.out.println("Phone Number: " + customerDetails.getPhoneNumber());
		System.out.println("Street Name: " + customerDetails.getStreetName());
		System.out.println("Bounce Points: " + customerDetails.calculateBonusPoints());
		System.out.println("Delivery Charge: " + customerDetails.deliveryCharge());
		
		
	}

}
