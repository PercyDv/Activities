package application2;

import java.util.Locale;
import java.util.Scanner;

import entities2.Salary;

public class Program2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Salary sal = new Salary();
		
		System.out.print("NAME: ");
		sal.name = kb.nextLine();
		System.out.print("GROSS SALARY: ");
		sal.grossSalary = kb.nextDouble();
		System.out.print("TAX: ");
		sal.tax = kb.nextDouble();
		
		System.out.printf("EMPLOYEE: %s, $ %.2f%n", sal.name, sal.netSalary());
		
		System.out.println("WHICH PERCENTAGE TO INCREASE SALARY?");
		double percentage = kb.nextDouble();
		sal.increaseSalary(percentage);
		
		System.out.printf("UPDATED DATA: %s", sal);
		kb.close();
	}

}
