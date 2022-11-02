package aplication;

import java.util.Scanner;

import domainProgram.program;
import domainProgram.programAdd;

public class ControlProgramEployees {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int times = sc.nextInt();
		for(int i = 1; i <= times; i++) {
			System.out.println("Employee #"+i+" :" );
			System.out.print("Outsorced (y/n)? ");
			char car = sc.next().charAt(0);
			if(car == 'n') {
				System.out.println("Name: ");
				String name = sc.nextLine();
				sc.next();
				System.out.println("Hours: ");
				int hours = sc.nextInt();
				System.out.println("Value per hour: ");
				double vl = sc.nextDouble();
				program p = new program(name, hours, vl);
				System.out.println("Payment: "+p.getName()+" - "+p.payment());
			}else
			System.out.println("Name: ");
			String name = sc.nextLine();
			sc.next();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double vl = sc.nextDouble();
			System.out.println("Additional charge: ");
			double addCharge = sc.nextDouble();
			programAdd pA = new programAdd(name, hours, vl, addCharge);
			System.out.println("Payment: "+pA.getName()+" - "+pA.payment());
			
		}
		
	}

}
