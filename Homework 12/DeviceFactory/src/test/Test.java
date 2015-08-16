package test;

import factory.*;

import java.util.Scanner;

import device.*;

public class Test {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in,	"UTF-8");
		
		String[] info = new String[4];
		
		fillInfo(info, inputs);
		
		DeviceFactory factory = DeviceFactory.getInstance();
		
		Device dev1 = factory.createDevice(info);
		
		System.out.println();
		dev1.printInfo();
		
		System.out.println();
		
		fillInfo(info, inputs);
		
		Device dev2 = factory.createDevice(info);
		
		dev2.printInfo();
		
	}
	
	public static void fillInfo(String[] info, Scanner inputs){
		
		System.out.println("What device do you want to create: ");
		info[0] = inputs.nextLine();
		
		System.out.println("Enter parameters: ");
		
		System.out.print("Brand: ");
		info[1] = inputs.nextLine();
		
		System.out.print("Model: ");
		info[2] = inputs.nextLine();
		
		if(info[0].equalsIgnoreCase("Laptop")){
			System.out.print("Processor model: ");
			info[3] = inputs.nextLine();
		}else if(info[0].equalsIgnoreCase("Phone")){
			System.out.print("Release date: ");
			info[3] = inputs.nextLine();
		}else if(info[0].equalsIgnoreCase("Tablet")){
			System.out.print("Display inches: ");
			info[3] = inputs.nextLine();
		}else{
			System.out.print("Enter info: ");
			info[3] = "Lala";
		}
	}

}