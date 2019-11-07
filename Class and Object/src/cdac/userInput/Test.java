package cdac.userInput;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter id");
		e1.setId(scan.nextInt());
		
		System.out.println("Enter name");
		
		e1.setName(scan.nextLine() + scan.nextLine());
		
		System.out.println("Enter salary");
		e1.setSalary(scan.nextFloat());
		
		e1.print();

	}
}
