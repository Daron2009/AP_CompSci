/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee D = new Employee(1987, "Dwight", "Shrute", 4416.66);
		Employee j = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee p = new Employee(2011, "Pam", "Beesly", 2250);
		Employee y = new Employee(4367, "Your", "Mom", 1.24);
		michael.raiseSalary(10);
		D.raiseSalary(10);
		j.raiseSalary(7);
		p.raiseSalary(27);
		y.raiseSalary(2);
		System.out.println(michael.getFirstName()+" "+ michael.getLastName());
		System.out.println(michael.getSalary());
		System.out.println(michael.getAnnualSalary());
		System.out.println(D.getFirstName()+" "+ D.getLastName());
		System.out.println(D.getSalary());
		System.out.println(D.getAnnualSalary());
		System.out.println(j.getFirstName()+" "+ j.getLastName());
		System.out.println(j.getSalary());
		System.out.println(j.getAnnualSalary());
		System.out.println(p.getFirstName()+" "+ p.getLastName());
		System.out.println(p.getSalary());
		System.out.println(p.getAnnualSalary());
		System.out.println(y.getFirstName()+" "+ y.getLastName());
		System.out.println(y.getSalary());
		System.out.println(y.getAnnualSalary());
		
		
	
	}
}
